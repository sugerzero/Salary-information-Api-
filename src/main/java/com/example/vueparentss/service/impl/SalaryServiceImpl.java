package com.example.vueparentss.service.impl;

import com.example.vueparentss.entity.Salary;
import com.example.vueparentss.dao.SalaryDao;
import com.example.vueparentss.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Salary)表服务实现类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
    @Resource
    private SalaryDao salaryDao;

    @Override
    public List<Salary> selectAll() {
        List<Salary> salaries = salaryDao.selectAll();
        return salaries;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param salId 主键
     * @return 实例对象
     */
    @Override
    public Salary queryById(Integer salId) {
        return this.salaryDao.queryById(salId);
    }

    @Override
    public List<Salary> queryByIds(Integer salId) {
        return this.salaryDao.queryByIds(salId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Salary> queryAllByLimit(int offset, int limit) {
        return this.salaryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param salary 实例对象
     * @return 实例对象
     */
    @Override
    public Salary insert(Salary salary) {
        this.salaryDao.insert(salary);
        return salary;
    }

    /**
     * 修改数据
     *
     * @param salary 实例对象
     * @return 实例对象
     */
    @Override
    public Salary update(Salary salary) {
        this.salaryDao.update(salary);
        return this.queryById(salary.getSalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param salId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer salId) {
        return this.salaryDao.deleteById(salId) > 0;
    }
}