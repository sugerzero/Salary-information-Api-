package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.WageItem;
import com.example.vueparentss.dao.WageItemDao;
import com.example.vueparentss.service.WageItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WageItem)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Service("wageItemService")
public class WageItemServiceImpl implements WageItemService {
    @Resource
    private WageItemDao wageItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param wageItemId 主键
     * @return 实例对象
     */
    @Override
    public WageItem queryById(Integer wageItemId) {
        return this.wageItemDao.queryById(wageItemId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WageItem> queryAllByLimit(int offset, int limit) {
        return this.wageItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wageItem 实例对象
     * @return 实例对象
     */
    @Override
    public WageItem insert(WageItem wageItem) {
        this.wageItemDao.insert(wageItem);
        return wageItem;
    }

    /**
     * 修改数据
     *
     * @param wageItem 实例对象
     * @return 实例对象
     */
    @Override
    public WageItem update(WageItem wageItem) {
        this.wageItemDao.update(wageItem);
        return this.queryById(wageItem.getWageItemId());
    }

    /**
     * 通过主键删除数据
     *
     * @param wageItemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer wageItemId) {
        return this.wageItemDao.deleteById(wageItemId) > 0;
    }
}