package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Checks;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Checks)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:09:12
 */
@Mapper
public interface ChecksDao {

    /**
     * 通过ID查询单条数据
     *
     * @param checksId 主键
     * @return 实例对象
     */
    Checks queryById(Integer checksId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Checks> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param checks 实例对象
     * @return 对象列表
     */
    List<Checks> queryAll(Checks checks);

    /**
     * 新增数据
     *
     * @param checks 实例对象
     * @return 影响行数
     */
    int insert(Checks checks);

    /**
     * 修改数据
     *
     * @param checks 实例对象
     * @return 影响行数
     */
    int update(Checks checks);

    /**
     * 通过主键删除数据
     *
     * @param checksId 主键
     * @return 影响行数
     */
    int deleteById(Integer checksId);

    List<Checks> checkstime();
    List<Checks> checkstimes();

}