package com.example.vueparentss.controller;

import com.example.vueparentss.entity.Post;
import com.example.vueparentss.service.PostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Post)表控制层
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@RestController
@RequestMapping("post")
public class PostController {
    /**
     * 服务对象
     */
    @Resource
    private PostService postService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Post selectOne(Integer id) {
        return this.postService.queryById(id);
    }
    /**
     *
     * @param postName 查询
     * @return
     */
    @GetMapping("selectpostName")
    public PageInfo selectOne(String postName,@RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "4") int size ,@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(page,size);
        List<Post> depts = postService.queryByName(postName);
        PageInfo pageInfo=new PageInfo(depts,size);
        return pageInfo;

    }


    /***
     * 查询全部信息
     */
    @RequestMapping("/selectAll")
    public PageInfo selectAll(@RequestParam(name="page",defaultValue = "1") int page, @RequestParam(name="pageSize",defaultValue = "4") int pageSize){
        PageHelper.startPage(page, pageSize);
        List<Post> posts = postService.selectAll();
        PageInfo PageInfo = new PageInfo(posts,page);
        return PageInfo;

    }
    /***
     * 添加信息
     */
    @RequestMapping("/insert")
    public int insert(String postName,String postDesc,double postSal){
        postService.insert(postName,postDesc,postSal);
        return 1;

    }

}