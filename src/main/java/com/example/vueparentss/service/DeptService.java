package com.example.vueparentss.service;

import com.example.vueparentss.entity.Dept;
import java.util.List;

/**
 * (Dept)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
public interface DeptService {

    /**
     * 查询所有职称
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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dept> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param
     * @return 实例对象
     */
    int insert(String deptName,String deptDesc);

    /**
     * 修改数据
     *
     * @param
     * @return 实例对象
     */
    int update(Integer deptId,String deptName,String deptDesc);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer deptId);
    /**
     *
     * @param deptName 主键
     * @return 影响行数
     */
    List<Dept> deptSelect(String deptName);


    String  inserts(String deptName);
}