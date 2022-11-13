package com.example.vueparentss.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.vueparentss.entity.Checks;
import com.example.vueparentss.entity.Salary;
import com.example.vueparentss.service.SalaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * (Salary)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@RestController
@RequestMapping("salary")
public class SalaryController {


    @Value("${output}")
    private String output;
    /**
     * 服务对象
     */
    @Resource
    private SalaryService salaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("selectOne")
//    public List<Salary> selectOne(Integer id) {
//        List<Salary> salaries = salaryService.queryByIds(id);
//        return salaries;
//    }
    @GetMapping("selectOne")
    public Salary selectOne(Integer id) {
        Salary salaries = salaryService.queryById(id);
        return salaries;
    }


    //导出工资信息
    @RequestMapping("/output")
    private String findall() throws IOException {

        List<Salary> findall = salaryService.selectAll();
        //导出Excel
        //使用ExcelExportUtil.exportExcel或去工作簿进行导出员工信息。
        //export 三个参数 1.ExportParams 导出配置对象   2.导出的类型   3.数据集合
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("工资信息表", "工资信息表"), Salary.class, findall);
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
    @GetMapping("selectTimes")
    public PageInfo selectall(){
        PageHelper.startPage(1,4);
        List<Salary> checkstime = salaryService.selectAll();
        PageInfo<Salary> checksPageInfo = new PageInfo<>( checkstime,4);
        System.out.println(checksPageInfo);
        return checksPageInfo;
    }
    @GetMapping("/finAlla")
    public PageInfo findAlla(@RequestParam(name = "page") int page, @RequestParam(name = "size", defaultValue = "4") int size){
        PageHelper.startPage(page,size);
        List<Salary> findall = salaryService.selectAll();
        PageInfo<Salary> salaryPageInfo = new PageInfo<Salary>(findall, size);
        System.out.println(salaryPageInfo);
        return salaryPageInfo;
    }


    @RequestMapping("/finAll")
    public List<Salary> findAll() {
        List<Salary> findall = salaryService.selectAll();
        return findall;
    }

    @RequestMapping("/finAlls")
    public List<Map> findAlls() {
        List<Salary> findall = salaryService.selectAll();
        ArrayList<Map> objects = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2= new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        HashMap<String, Integer> map4 = new HashMap<>();
        HashMap<String, Integer> map5 = new HashMap<>();
        int data1 = 0;
        int data2 = 0;
        int data3 = 0;
        int data4 = 0;
        int data5 = 0;
        int data6 = 0;
        for (int i = 0; i < findall.size(); i++) {
            if (3000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 2000) {
                data1++;
            } else if (4000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 3000) {
                data2++;
            } else if (5000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 4000) {
                data3++;
            } else if (6000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 5000) {
                data4++;
            } else if (7000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 6000) {
                data5++;
            } else if ((int) findall.get(i).getRealSal() > 7000) {
                data6++;
            }
        }
        map.put("id",1);
        map.put("Number", data1);
        map1.put("id",2);
        map1.put("Number", data2);
        map2.put("id",3);
        map2.put("Number", data3);
        map3.put("id",4);
        map3.put("Number", data4);
        map4.put("id",5);
        map4.put("Number", data5);
        map5.put("id",6);
        map5.put("Number", data6);
        objects.add(map);
        objects.add(map1);
        objects.add(map2);
        objects.add(map3);
        objects.add(map4);
        objects.add(map5);

        return objects;
    }
    @RequestMapping("/insert")
    public int inserts(Salary salary){
        Salary insert = salaryService.insert(salary);
        return 0;
    }
//@RequestMapping("/finAlls")
//public List<Integer> findAlls() {
//    List<Salary> findall = salaryService.selectAll();
//    ArrayList<Integer> objects = new ArrayList<>();
//    int data1 = 0;
//    int data2 = 0;
//    int data3 = 0;
//    int data4 = 0;
//    int data5 = 0;
//    int data6 = 0;
//    for (int i = 0; i < findall.size(); i++) {
//        if (3000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 2000) {
//            data1++;
//        } else if (4000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 3000) {
//            data2++;
//        } else if (5000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 4000) {
//            data3++;
//        } else if (6000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 5000) {
//            data4++;
//        } else if (7000 >= (int) findall.get(i).getRealSal() && (int) findall.get(i).getRealSal() > 6000) {
//            data5++;
//        } else if ((int) findall.get(i).getRealSal() > 7000) {
//            data6++;
//        }
//    }
//    objects.add(data1);
//    objects.add(data2);
//    objects.add(data3);
//    objects.add(data4);
//    objects.add(data5);
//    objects.add(data6);
//    return objects;
//}
}