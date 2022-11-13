package com.example.vueparentss.service;

import com.example.vueparentss.entity.Title;
import java.util.List;

/**
 * (Title)表服务接口
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public interface TitleService {

    /**
     * 通过ID查询单条数据
     *
     * @param titleId 主键
     * @return 实例对象
     */
    Title queryById(Integer titleId);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Title> queryAllByLimit();

    /**
     * 新增数据
     *
     * @param title 实例对象
     * @return 实例对象
     */
    Title insert(Title title);

    /**
     * 修改数据
     *
     * @param title 实例对象
     * @return 实例对象
     */
    Title update(Title title);

    /**
     * 通过主键删除数据
     *
     * @param titleId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer titleId);



    String  insert(String titleName);

}