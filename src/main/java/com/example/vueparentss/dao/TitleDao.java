package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Title)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Mapper
public interface TitleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param titleId 主键
     * @return 实例对象
     */
    Title queryById(Integer titleId);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<Title> queryAllByLimit();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param title 实例对象
     * @return 对象列表
     */
    List<Title> queryAll(Title title);

    /**
     * 新增数据
     *
     * @param title 实例对象
     * @return 影响行数
     */
    int insert(Title title);

    /**
     * 修改数据
     *
     * @param title 实例对象
     * @return 影响行数
     */
    int update(Title title);

    /**
     * 通过主键删除数据
     *
     * @param titleId 主键
     * @return 影响行数
     */
    int deleteById(Integer titleId);


     String  inserts(String titleName);
//    @Param("titleName") String titleName,
//    @Param("deptName") String deptName,
}