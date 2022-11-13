package com.example.vueparentss.controller;

import com.example.vueparentss.entity.Emp;
import com.example.vueparentss.entity.Emps;
import com.example.vueparentss.entity.Salary;
import com.example.vueparentss.service.EmpService;
import com.example.vueparentss.service.EmpsService;
import com.example.vueparentss.service.SalaryService;
import com.example.vueparentss.service.TitleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@RestController
@RequestMapping("emp")
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

    @Resource
    private EmpsService empsService;

    @Resource
    private TitleService titleService;

    @Resource
    private SalaryService salaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Map<String,Object> selectOne(Integer id) {
        HashMap<String, Object> maps = new HashMap<>();
        Emp emp = empService.queryById(id);
        String empName = emp.getEmpName();
        maps.put("name",empName);
        Integer empId = emp.getEmpId();
        maps.put("ID",empId);
        return maps;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param empName 主键
     * @return 单条数据
     */
    @GetMapping("queryByName")
    public PageInfo selectName(String empName,@RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "4") int size ,@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(page,size);
        List<Emp> depts = empService.queryByName(empName);
        PageInfo pageInfo=new PageInfo(depts,size);
        return pageInfo;
    }

    /**
     * 按条件查询
     * 查询全部
     */
    @ResponseBody
    @RequestMapping("/selectAll")
    public PageInfo selectAll(@RequestParam(value = "empId" ,required = false) Integer empId, @RequestParam(value = "empName",required = false) String empName, @RequestParam(value = "deptId",required = false) Integer deptId, @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Emps> emps = empsService.selectAll(empId, empName, deptId);
        PageInfo pageInfo = new PageInfo(emps, 5);
        return pageInfo;
    }


    @RequestMapping("/delectId")
    public boolean delectId(int id){
        boolean b = empService.deleteById(id);
        return b;
    }

    @RequestMapping("/insertOne")
    public String insertOne(String name,String sex,String Edu,String Tel,int title_id,
                            int dept_id,int post_id,String people,String peo_Tel){

        empsService.insertOne(name, sex, Edu, Tel, title_id, dept_id, post_id, people, peo_Tel);
//        List<Emp> emps = empService.queryByName(name);
//        Emp emp = emps.get(0);
//        Integer empId = emp.getEmpId();
//        Salary salary = new Salary();
//        salary.setEmpId(empId);
//        salary.setEmpName(name);
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String format = simpleDateFormat.format(date);
//        salary.setMon(format);
//        Salary insert = salaryService.insert(salary);
        return  "Success";
    }
}