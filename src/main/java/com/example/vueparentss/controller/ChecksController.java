package com.example.vueparentss.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.poi.excel.ExcelUtil;
import com.example.vueparentss.entity.Checks;
import com.example.vueparentss.entity.Salary;
import com.example.vueparentss.service.ChecksService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (Checks)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:09:13
 */
@RestController
@RequestMapping("checks")
public class ChecksController {
    /**
     * 服务对象
     */
    @Resource
    private ChecksService checksService;
    @Value("${output}")
    private String output;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Checks selectOne(Integer id) {
        return this.checksService.queryById(id);
    }

    @GetMapping("selectTime")
//    public PageInfo selectAll1(@RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "5") int size) {
//        PageHelper.startPage(page,size);
//        List<Checks> checks = checksService.checkstime();
//        PageInfo pageInfo=new PageInfo(checks,size);
//        return pageInfo;
//    }
    public PageInfo selectall() {
        PageHelper.startPage(1, 4);
        List<Checks> checkstime = checksService.checkstime();
        PageInfo<Checks> checksPageInfo = new PageInfo<>(checkstime, 4);
        System.out.println(checksPageInfo);
        return checksPageInfo;
    }

    @GetMapping("selectTimes")
    public PageInfo selectall(@RequestParam(name = "page") int page, @RequestParam(name = "size", defaultValue = "4") int size) {
        PageHelper.startPage(page, size);
        List<Checks> checkstime = checksService.checkstime();
        PageInfo<Checks> checksPageInfo = new PageInfo<>(checkstime, size);
        System.out.println(checksPageInfo);
        return checksPageInfo;
    }
    //导入考勤信息

    @PostMapping("/input")
    public void findalls(MultipartFile file) throws Exception {
        String originalFilename = file.getOriginalFilename();
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        List<Object> objects = ExcelImportUtil.importExcel(new FileInputStream(output+originalFilename),Checks.class,params);
        for (Object info : objects) {
            System.out.println(info.toString());
        }
//        checksService.insert((Checks) objects.get(0));
        Integer early = ((Checks) objects.get(0)).getEarly();
        Integer sickLeave = ((Checks) objects.get(0)).getSickLeave();
        Integer affairLeave = ((Checks) objects.get(0)).getAffairLeave();
        Object usualHour = ((Checks) objects.get(0)).getUsualHour();
        Object weekHour = ((Checks) objects.get(0)).getWeekHour();
        Object holidayHour = ((Checks) objects.get(0)).getHolidayHour();
        Integer late = ((Checks) objects.get(0)).getLate();
        System.out.println(Integer.parseInt(usualHour.toString()));

        Integer a = 0;
        a= early*2+sickLeave*2+affairLeave*2+Integer.parseInt(usualHour.toString())*2+Integer.parseInt(weekHour.toString())*2
                +Integer.parseInt(holidayHour.toString())*2+ late*2;
        System.out.println(a);
    }

    //   成功
//    @GetMapping("/input")
//    public void findalls(MultipartFile file) throws Exception {
//        String originalFilename = file.getOriginalFilename();
//        ImportParams params = new ImportParams();
//        params.setTitleRows(1);
//        params.setHeadRows(1);
//        List<Object> objects = ExcelImportUtil.importExcel(new FileInputStream(output+originalFilename),Checks.class,params);
//        for (Object info : objects) {
//            System.out.println(info.toString());
//        }
//        checksService.insert((Checks) objects.get(0));
//    }
    //导入考勤信息

//        @PostMapping("/input")
//    public void findalls() throws Exception {
//        ImportParams params = new ImportParams();
//        params.setTitleRows(1);
//        params.setHeadRows(1);
//        List<Object> objects = ExcelImportUtil.importExcel(new FileInputStream("C:/Users/pc/Desktop/员工信息2022-05-24.xls"),Checks.class,params);
////        for (Object info : objects) {
////            System.out.println(info.toString());
////            checksService.insert((Checks) info);
////        }
//
//    }
//    @PostMapping("/input")
//    public String findalls(MultipartFile file) throws Exception {
//        List<Checks> infoList = ExcelUtil.getReader(file.getInputStream()).readAll(Checks.class);
//        System.out.println(infoList);
//        for (Checks info : infoList) {
//            System.out.println(info.toString());
//            checksService.insert(info);
//        }
//        return "success";
//    }
    //导出工资信息
    @RequestMapping("/output")
    private String findall() throws IOException {

        List<Checks> findall = checksService.checkstimes();
        //导出Excel
        //使用ExcelExportUtil.exportExcel或去工作簿进行导出员工信息。
        //export 三个参数 1.ExportParams 导出配置对象   2.导出的类型   3.数据集合
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("工资信息表", "工资信息表"), Checks.class, findall);
        //创建导出表的时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        //使用时间拼接文件名
        String filepath = output + "员工信息" + format + ".xls";
        System.out.println(filepath);
        //创建输出的文件
        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
        return "Success";

    }
}