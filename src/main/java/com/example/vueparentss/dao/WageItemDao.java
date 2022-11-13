package com.example.vueparentss.dao;

import com.example.vueparentss.entity.WageItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WageItem)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Mapper
public interface WageItemDao {

    /**
     * 通过ID查询单条数据
     *
     * @param wageItemId 主键
     * @return 实例对象
     */
    WageItem queryById(Integer wageItemId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WageItem> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wageItem 实例对象
     * @return 对象列表
     */
    List<WageItem> queryAll(WageItem wageItem);

    /**
     * 新增数据
     *
     * @param wageItem 实例对象
     * @return 影响行数
     */
    int insert(WageItem wageItem);

    /**
     * 修改数据
     *
     * @param wageItem 实例对象
     * @return 影响行数
     */
    int update(WageItem wageItem);

    /**
     * 通过主键删除数据
     *
     * @param wageItemId 主键
     * @return 影响行数
     */
    int deleteById(Integer wageItemId);

}