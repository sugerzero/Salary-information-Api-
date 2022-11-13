package com.example.vueparentss.controller;

import com.example.vueparentss.entity.DataInfo;
import com.example.vueparentss.service.DataInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DataInfo)表控制层
 *
 * @author makejava
 * @since 2022-02-11 19:03:11
 */
@RestController
@RequestMapping("dataInfo")
public class DataInfoController {
    /**
     * 服务对象
     */
    @Resource
    private DataInfoService dataInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DataInfo selectOne(Integer id) {
        return this.dataInfoService.queryById(id);
    }

}