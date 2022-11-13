package com.example.vueparentss.service;

import com.example.vueparentss.entity.Post;
import java.util.List;

/**
 * (Post)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
public interface PostService {

    /**
     *
     * @param postName 主键
     * @return 影响行数
     */
    List<Post> postSelect(String postName);

    /**
     *
     * @param postName 查询
     * @return
     */
    List<Post> queryByName(String postName);
    /**
     * 查询全部信息
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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Post> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param
     * @return void
     */
    int insert(String postName,String postDesc,double postSal);

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    Post update(Post post);

    /**
     * 通过主键删除数据
     *
     * @param postId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer postId);

}