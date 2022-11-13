package com.example.vueparentss.service;

import com.example.vueparentss.entity.Salary;
import java.util.List;

/**
 * (Salary)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public interface SalaryService {


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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Salary> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param salary 实例对象
     * @return 实例对象
     */
    Salary insert(Salary salary);

    /**
     * 修改数据
     *
     * @param salary 实例对象
     * @return 实例对象
     */
    Salary update(Salary salary);

    /**
     * 通过主键删除数据
     *
     * @param salId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer salId);

}