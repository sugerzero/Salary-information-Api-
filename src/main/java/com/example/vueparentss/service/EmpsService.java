package com.example.vueparentss.service;

import com.example.vueparentss.entity.Emps;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface EmpsService {
    /**
     * 条件查询
     * 查询全部
     */

    List<Emps> selectAll(Integer empId, String empName, Integer deptId);


    List<Emps> selectName(String empName);

    int insertOne(@Param("name")String name,
                     @Param("sex") String sex,
                     @Param("Edu") String Edu,
                     @Param("Tel") String Tel,
                     @Param("title_id") int title_id,
                     @Param("dept_id") int dept_id,
                     @Param("post_id") int post_id,
                     @Param("people") String people,
                     @Param("peo_Tel") String peo_Tel);
}
