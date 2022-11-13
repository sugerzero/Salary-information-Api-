package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.Emp;
import com.example.vueparentss.dao.EmpDao;
import com.example.vueparentss.entity.Emps;
import com.example.vueparentss.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Emp)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;

//    @Override
//    public List<Emps> selectAll(Integer empId, String empName, Integer deptId) {
//        return empDao.selectAll(empId,empName,deptId);
//    }

    /**
     * 通过ID查询单条数据
     *
     * @param empId 主键
     * @return 实例对象
     */
    @Override
    public Emp queryById(Integer empId) {
        return this.empDao.queryById(empId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Emp> queryAllByLimit(int offset, int limit) {
        return this.empDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param emp 实例对象
     * @return 实例对象
     */
    @Override
    public Emp insert(Emp emp) {
        this.empDao.insert(emp);
        return emp;
    }

    /**
     * 修改数据
     *
     * @param emp 实例对象
     * @return 实例对象
     */
    @Override
    public Emp update(Emp emp) {
        this.empDao.update(emp);
        return this.queryById(emp.getEmpId());
    }

    /**
     * 通过主键删除数据
     *
     * @param empId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empId) {
        return this.empDao.deleteById(empId) > 0;
    }

    @Override
    public List<Emp> queryByName(String name) {
        return empDao.queryByName(name);
    }
}