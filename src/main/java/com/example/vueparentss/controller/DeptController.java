package com.example.vueparentss.controller;

import com.example.vueparentss.entity.Dept;
import com.example.vueparentss.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    /**
     * 服务对象
     */
    @Resource
    private DeptService deptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dept selectOne(Integer id) {
        return this.deptService.queryById(id);
    }

    /**
     *
     * @param deptName 查询
     * @return
     */
    @GetMapping("selectdeptName")
    public PageInfo selectOne(String deptName,@RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "4") int size ,@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(page,size);
        List<Dept> depts = deptService.queryByName(deptName);
        PageInfo pageInfo=new PageInfo(depts,size);
        return pageInfo;

    }
    /**
     * 通过主键查询单条数据
     *
     * @param postName 主键
     * @return 单条数据
     */
    /**
     * 按条件查询
     * 查询全部
     */
    @ResponseBody
    @RequestMapping("/selectdept")
    public PageInfo selectpost(@RequestParam(value = "deptName" ,required = false) String deptName, @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Dept> emps = deptService.deptSelect(deptName);
        PageInfo pageInfo = new PageInfo(emps, 5);
        return pageInfo;
    }
/**
 * 查询全部信息
 *
 */
@RequestMapping("/selectAll")
public PageInfo selectAll1( @RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "4") int size) {
    PageHelper.startPage(page,size);
    List<Dept> depts = deptService.selectAll();
    PageInfo pageInfo=new PageInfo(depts,size);
    return pageInfo;
}

/**
 * 删除部门信息
 */
@RequestMapping("/deleteId")
public String deleteById(Integer deptId){

    boolean b = deptService.deleteById(deptId);

    if (b==true){
        return "Success";
    }else {
        return "error";
    }

}

@RequestMapping("/update")
    public String update(Integer deptId,String deptName,String deptDesc){
if (deptName==""){
    return "error";
}else if(deptDesc==""){
    return "error";
}else {
    int update= deptService.update(deptId,deptName,deptDesc);
    if (update==1){
        return "Success";
    }else{
        return "error";
    }
}

}
    @RequestMapping("/insert")
    public String insert(String deptName,String deptDesc){
        int insert = deptService.insert(deptName, deptDesc);
        if (insert==1){
            return "Success";
        }else {
            return "error";
        }
    }


}