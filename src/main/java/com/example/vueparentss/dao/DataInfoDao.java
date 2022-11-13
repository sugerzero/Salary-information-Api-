package com.example.vueparentss.dao;

import com.example.vueparentss.entity.DataInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (DataInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-11 19:03:11
 */
@Mapper
public interface DataInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    DataInfo queryById(Integer deptId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DataInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dataInfo 实例对象
     * @return 对象列表
     */
    List<DataInfo> queryAll(DataInfo dataInfo);

    /**
     * 新增数据
     *
     * @param dataInfo 实例对象
     * @return 影响行数
     */
    int insert(DataInfo dataInfo);

    /**
     * 修改数据
     *
     * @param dataInfo 实例对象
     * @return 影响行数
     */
    int update(DataInfo dataInfo);

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 影响行数
     */
    int deleteById(Integer deptId);

}