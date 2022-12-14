package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.ListIterator;

/**
 * (Salary)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Mapper
public interface SalaryDao {

    List<Salary> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param salId 主键
     * @return 实例对象
     */
    Salary queryById(Integer salId);

    List<Salary> queryByIds(Integer salId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Salary> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param salary 实例对象
     * @return 对象列表
     */
    List<Salary> queryAll(Salary salary);

    /**
     * 新增数据
     *
     * @param salary 实例对象
     * @return 影响行数
     */
    int insert(Salary salary);

    /**
     * 修改数据
     *
     * @param salary 实例对象
     * @return 影响行数
     */
    int update(Salary salary);

    /**
     * 通过主键删除数据
     *
     * @param salId 主键
     * @return 影响行数
     */
    int deleteById(Integer salId);

}