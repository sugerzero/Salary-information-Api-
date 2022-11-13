package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.WorkTimes;
import com.example.vueparentss.dao.WorkTimesDao;
import com.example.vueparentss.service.WorkTimesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WorkTimes)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Service("workTimesService")
public class WorkTimesServiceImpl implements WorkTimesService {
    @Resource
    private WorkTimesDao workTimesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param workId 主键
     * @return 实例对象
     */
    @Override
    public WorkTimes queryById(Integer workId) {
        return this.workTimesDao.queryById(workId);
    }

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    @Override
    public List<WorkTimes> queryAllByLimit() {
        return this.workTimesDao.queryAllByLimit();
    }

    /**
     * 新增数据
     *
     * @param workTimes 实例对象
     * @return 实例对象
     */
    @Override
    public WorkTimes insert(WorkTimes workTimes) {
        this.workTimesDao.insert(workTimes);
        return workTimes;
    }

    /**
     * 修改数据
     *
     * @param workTimes 实例对象
     * @return 实例对象
     */
    @Override
    public WorkTimes update(WorkTimes workTimes) {
        this.workTimesDao.update(workTimes);
        return this.queryById(workTimes.getWorkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param workId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer workId) {
        return this.workTimesDao.deleteById(workId) > 0;
    }
}