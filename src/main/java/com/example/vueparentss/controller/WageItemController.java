package com.example.vueparentss.controller;

import com.example.vueparentss.entity.WageItem;
import com.example.vueparentss.service.WageItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WageItem)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@RestController
@RequestMapping("wageItem")
public class WageItemController {
    /**
     * 服务对象
     */
    @Resource
    private WageItemService wageItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WageItem selectOne(Integer id) {
        return this.wageItemService.queryById(id);
    }




}