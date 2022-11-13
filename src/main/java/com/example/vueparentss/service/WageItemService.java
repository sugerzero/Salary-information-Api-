package com.example.vueparentss.service;

import com.example.vueparentss.entity.WageItem;
import java.util.List;

/**
 * (WageItem)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public interface WageItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param wageItemId 主键
     * @return 实例对象
     */
    WageItem queryById(Integer wageItemId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WageItem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wageItem 实例对象
     * @return 实例对象
     */
    WageItem insert(WageItem wageItem);

    /**
     * 修改数据
     *
     * @param wageItem 实例对象
     * @return 实例对象
     */
    WageItem update(WageItem wageItem);

    /**
     * 通过主键删除数据
     *
     * @param wageItemId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer wageItemId);

}