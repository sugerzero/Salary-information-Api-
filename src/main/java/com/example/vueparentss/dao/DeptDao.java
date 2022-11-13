package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Dept)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@Mapper
public interface DeptDao {



    /**
     * 查询所有部门
     * @return
     */
    List<Dept> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    Dept queryById(Integer deptId);
    /**
     *
     * @param deptName 查询
     * @return
     */
    List<Dept> queryByName(String deptName);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dept> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dept 实例对象
     * @return 对象列表
     */
    List<Dept> queryAll(Dept dept);

    /**
     * 新增数据
     *
     *
     * @return 影响行数
     */
    void insert(String deptName,String deptDesc);

    /**
     * 修改数据
     *
     * @param
     * @return 影响行数
     */
    int update(Integer deptId,String deptName,String deptDesc);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 影响行数
     */
    int deleteById(Integer deptId);


    /**
     *
     * @param deptName 主键
     * @return 影响行数
     */
    List<Dept> deptSelect(String deptName);


    String  inserts(String deptName);

}