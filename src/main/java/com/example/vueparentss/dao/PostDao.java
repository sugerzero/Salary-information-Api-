package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * (Post)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@Mapper
public interface PostDao {


    /**
     *
     * @param deptName 查询
     * @return
     */
    List<Post> queryByName(String deptName);
    /**
     * 查询全部信息
     * @return
     */
    List<Post> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param postId 主键
     * @return 实例对象
     */
    Post queryById(Integer postId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Post> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param post 实例对象
     * @return 对象列表
     */
    List<Post> queryAll(Post post);

    /**
     * 新增数据
     * @return void
     */
    void insert(String postName,String postDesc,double postSal);

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 影响行数
     */
    int update(Post post);

    /**
     * 通过主键删除数据
     *
     * @param postId 主键
     * @return 影响行数
     */
    int deleteById(Integer postId);

    /**
     *
     * @param postName 主键
     * @return 影响行数
     */
    List<Post> postSelect(String postName);

}