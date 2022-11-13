package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.Post;
import com.example.vueparentss.dao.PostDao;
import com.example.vueparentss.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Post)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@Service("postService")
public class PostServiceImpl implements PostService {
    @Override
    public List<Post> postSelect(String postName) {
        return postDao.postSelect(postName);
    }

    /**
     *
     * @param postName 查询
     * @return
     */
    @Override
    public List<Post> queryByName(String postName) {
        List<Post> posts = postDao.queryByName(postName);
        return posts;
    }
    @Resource
    private PostDao postDao;

    @Override
    public List<Post> selectAll() {
        return postDao.selectAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param postId 主键
     * @return 实例对象
     */
    @Override
    public Post queryById(Integer postId) {
        return this.postDao.queryById(postId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Post> queryAllByLimit(int offset, int limit) {
        return this.postDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public int insert(String postName,String postDesc,double postSal) {
        this.postDao.insert(postName, postDesc, postSal);
        return 1;
    }

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    @Override
    public Post update(Post post) {
        this.postDao.update(post);
        return this.queryById(post.getPostId());
    }

    /**
     * 通过主键删除数据
     *
     * @param postId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer postId) {
        return this.postDao.deleteById(postId) > 0;
    }
}