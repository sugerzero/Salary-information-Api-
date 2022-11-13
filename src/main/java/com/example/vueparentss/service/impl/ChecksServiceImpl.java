package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.Checks;
import com.example.vueparentss.dao.ChecksDao;
import com.example.vueparentss.service.ChecksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Checks)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:09:13
 */
@Service("checksService")
public class ChecksServiceImpl implements ChecksService {
    @Resource
    private ChecksDao checksDao;

    /**
     * 通过ID查询单条数据
     *
     * @param checksId 主键
     * @return 实例对象
     */
    @Override
    public Checks queryById(Integer checksId) {
        return this.checksDao.queryById(checksId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Checks> queryAllByLimit(int offset, int limit) {
        return this.checksDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param checks 实例对象
     * @return 实例对象
     */
    @Override
    public Checks insert(Checks checks) {
        this.checksDao.insert(checks);
        return checks;
    }

    /**
     * 修改数据
     *
     * @param checks 实例对象
     * @return 实例对象
     */
    @Override
    public Checks update(Checks checks) {
        this.checksDao.update(checks);
        return this.queryById(checks.getChecksId());
    }

    /**
     * 通过主键删除数据
     *
     * @param checksId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer checksId) {
        return this.checksDao.deleteById(checksId) > 0;
    }

    @Override
    public List<Checks> checkstime() {
        return checksDao.checkstime();
    }

    @Override
    public List<Checks> checkstimes() {
        return checksDao.checkstimes();
    }
}