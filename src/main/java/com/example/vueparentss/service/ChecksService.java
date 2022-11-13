package com.example.vueparentss.service;

import com.example.vueparentss.entity.Checks;
import java.util.List;

/**
 * (Checks)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:09:13
 */
public interface ChecksService {

    /**
     * 通过ID查询单条数据
     *
     * @param checksId 主键
     * @return 实例对象
     */
    Checks queryById(Integer checksId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Checks> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param checks 实例对象
     * @return 实例对象
     */
    Checks insert(Checks checks);

    /**
     * 修改数据
     *
     * @param checks 实例对象
     * @return 实例对象
     */
    Checks update(Checks checks);

    /**
     * 通过主键删除数据
     *
     * @param checksId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer checksId);

    List<Checks> checkstime();


    List<Checks> checkstimes();
}