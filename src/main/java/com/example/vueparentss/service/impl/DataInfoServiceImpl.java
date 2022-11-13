package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.DataInfo;
import com.example.vueparentss.dao.DataInfoDao;
import com.example.vueparentss.service.DataInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DataInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-02-11 19:03:11
 */
@Service("dataInfoService")
public class DataInfoServiceImpl implements DataInfoService {
    @Resource
    private DataInfoDao dataInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    @Override
    public DataInfo queryById(Integer deptId) {
        return this.dataInfoDao.queryById(deptId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DataInfo> queryAllByLimit(int offset, int limit) {
        return this.dataInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dataInfo 实例对象
     * @return 实例对象
     */
    @Override
    public DataInfo insert(DataInfo dataInfo) {
        this.dataInfoDao.insert(dataInfo);
        return dataInfo;
    }

    /**
     * 修改数据
     *
     * @param dataInfo 实例对象
     * @return 实例对象
     */
    @Override
    public DataInfo update(DataInfo dataInfo) {
        this.dataInfoDao.update(dataInfo);
        return this.queryById(dataInfo.getDeptId());
    }

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer deptId) {
        return this.dataInfoDao.deleteById(deptId) > 0;
    }
}