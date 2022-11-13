package com.example.vueparentss.service.impl;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import com.example.vueparentss.dao.EmpsDao;
import com.example.vueparentss.entity.Emps;
import com.example.vueparentss.service.EmpsService;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpsServiceImpl implements EmpsService {

    @Autowired
    EmpsDao empsDao;


    @Override
    public List<Emps> selectAll(Integer empId, String empName, Integer deptId) {
        List<Emps> emps = empsDao.selectAll(empId, empName, deptId);
        return emps;
    }

    @Override
    public List<Emps> selectName(String empName) {
        List<Emps> emps = empsDao.selectName(empName);
        return null;
    }

    @Override
    public int insertOne(String name,
                            String sex,
                            String Edu,
                            String Tel,
                            int title_id,
                            int dept_id,
                            int post_id,
                            String people,
                            String peo_Tel) {
        empsDao.insertOne(name,sex,Edu,Tel,title_id,dept_id,post_id,people,peo_Tel);
        return 1;
    }







}
