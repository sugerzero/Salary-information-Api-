package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.Dept;
import com.example.vueparentss.dao.DeptDao;
import com.example.vueparentss.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    protected DeptDao deptDao;

    @Override
    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    @Override
    public Dept queryById(Integer deptId) {
        return this.deptDao.queryById(deptId);
    }
    /**
     *
     * @param deptName 查询
     * @return
     */
    @Override
    public List<Dept> queryByName(String deptName) {
        List<Dept> depts = deptDao.queryByName(deptName);
        return depts;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dept> queryAllByLimit(int offset, int limit) {
        return this.deptDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public int insert(String deptName,String deptDesc) {
        List<Dept> dept = deptDao.queryByName(deptName);
        if (deptName=="" || deptDesc==""){
            return 0;
        }else if (dept.size()!=0){
            return 0;
        }else {
            deptDao.insert(deptName, deptDesc);
            return 1;
        }
    }

    /**
     * 修改数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public int update(Integer deptId,String deptName,String deptDesc) {
        deptDao.update(deptId,deptName,deptDesc);
        return 1;
    }

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer deptId) {
        return this.deptDao.deleteById(deptId) > 0;
    }

    @Override
    public List<Dept> deptSelect(String deptName) {
        return deptDao.deptSelect(deptName);
    }

    @Override
    public String inserts(String deptName) {
        return deptDao.inserts(deptName);
    }
}