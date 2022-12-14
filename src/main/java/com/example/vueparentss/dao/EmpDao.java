package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * (Emp)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@Mapper
public interface EmpDao {
    /**
     * 按照名字查询
     * @param name
     * @return
     */
    List<Emp> queryByName(String name);

    /**
     * 通过ID查询单条数据
     *
     * @param empId 主键
     * @return 实例对象
     */
    Emp queryById(Integer empId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Emp> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param emp 实例对象
     * @return 对象列表
     */
    List<Emp> queryAll(Emp emp);

    /**
     * 新增数据
     *
     * @param emp 实例对象
     * @return 影响行数
     */
    int insert(Emp emp);

    /**
     * 修改数据
     *
     * @param emp 实例对象
     * @return 影响行数
     */
    int update(Emp emp);

    /**
     * 通过主键删除数据
     *
     * @param empId 主键
     * @return 影响行数
     */
    int deleteById(Integer empId);



}