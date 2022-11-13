package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.Title;
import com.example.vueparentss.dao.TitleDao;
import com.example.vueparentss.service.TitleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Title)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Service("titleService")
public class TitleServiceImpl implements TitleService {
    @Resource
    private TitleDao titleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param titleId 主键
     * @return 实例对象
     */
    @Override
    public Title queryById(Integer titleId) {
        return this.titleDao.queryById(titleId);
    }

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    @Override
    public List<Title> queryAllByLimit() {
        return this.titleDao.queryAllByLimit();
    }

    /**
     * 新增数据
     *
     * @param title 实例对象
     * @return 实例对象
     */
    @Override
    public Title insert(Title title) {
        this.titleDao.insert(title);
        return title;
    }

    /**
     * 修改数据
     *
     * @param title 实例对象
     * @return 实例对象
     */
    @Override
    public Title update(Title title) {
        this.titleDao.update(title);
        return this.queryById(title.getTitleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param titleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer titleId) {
        return this.titleDao.deleteById(titleId) > 0;
    }

    @Override
    public String insert(String titleName) {
        return this.titleDao.inserts(titleName);
    }
}