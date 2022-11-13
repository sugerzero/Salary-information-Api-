package com.example.vueparentss.service;

import com.example.vueparentss.entity.WorkTimes;
import java.util.List;

/**
 * (WorkTimes)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public interface WorkTimesService {

    /**
     * 通过ID查询单条数据
     *
     * @param workId 主键
     * @return 实例对象
     */
    WorkTimes queryById(Integer workId);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<WorkTimes> queryAllByLimit();

    /**
     * 新增数据
     *
     * @param workTimes 实例对象
     * @return 实例对象
     */
    WorkTimes insert(WorkTimes workTimes);

    /**
     * 修改数据
     *
     * @param workTimes 实例对象
     * @return 实例对象
     */
    WorkTimes update(WorkTimes workTimes);

    /**
     * 通过主键删除数据
     *
     * @param workId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer workId);

}