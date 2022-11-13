package com.example.vueparentss.controller;

import com.example.vueparentss.entity.WorkTimes;
import com.example.vueparentss.service.WorkTimesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkTimes)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@RestController
@RequestMapping("workTimes")
public class WorkTimesController {
    /**
     * 服务对象
     */
    @Resource
    private WorkTimesService workTimesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WorkTimes selectOne(Integer id) {
        return this.workTimesService.queryById(id);
    }


    @GetMapping("/selectAll")
    public PageInfo selectAll(@RequestParam (name = "page",defaultValue ="1") int page,@RequestParam(name = "size",defaultValue = "4") int size){
        PageHelper.startPage(page,size);
        List<WorkTimes> workTimes = workTimesService.queryAllByLimit();
        PageInfo pageInfo = new PageInfo(workTimes, size);
        return  pageInfo;
    }


}