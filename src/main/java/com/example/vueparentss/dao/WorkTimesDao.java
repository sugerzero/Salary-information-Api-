package com.example.vueparentss.dao;

import com.example.vueparentss.entity.WorkTimes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WorkTimes)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Mapper
public interface WorkTimesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param workId 主键
     * @return 实例对象
     */
    WorkTimes queryById(Integer workId);

    /**
     * 查询指定行数据
     *

     * @return 对象列表
     */
    List<WorkTimes> queryAllByLimit();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param workTimes 实例对象
     * @return 对象列表
     */
    List<WorkTimes> queryAll(WorkTimes workTimes);

    /**
     * 新增数据
     *
     * @param workTimes 实例对象
     * @return 影响行数
     */
    int insert(WorkTimes workTimes);

    /**
     * 修改数据
     *
     * @param workTimes 实例对象
     * @return 影响行数
     */
    int update(WorkTimes workTimes);

    /**
     * 通过主键删除数据
     *
     * @param workId 主键
     * @return 影响行数
     */
    int deleteById(Integer workId);

}