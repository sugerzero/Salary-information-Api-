package com.example.vueparentss.service;

import com.example.vueparentss.entity.DataInfo;
import java.util.List;

/**
 * (DataInfo)表服务接口
 *
 * @author makejava
 * @since 2022-02-11 19:03:11
 */
public interface DataInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    DataInfo queryById(Integer deptId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DataInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dataInfo 实例对象
     * @return 实例对象
     */
    DataInfo insert(DataInfo dataInfo);

    /**
     * 修改数据
     *
     * @param dataInfo 实例对象
     * @return 实例对象
     */
    DataInfo update(DataInfo dataInfo);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer deptId);

}