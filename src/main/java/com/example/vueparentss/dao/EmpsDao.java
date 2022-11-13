package com.example.vueparentss.dao;

import com.example.vueparentss.entity.Emps;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmpsDao {

    /**
     * 如果三个参数都为null，即为查询所有，否则按条件查询
     *
     * @param empId   员工id
     * @param empName 员工姓名
     * @param deptId  部门id
     * @return
     */

    List<Emps> selectAll(@Param("emId") Integer empId, @Param("empName") String empName, @Param("deptId") Integer deptId);


    /**
     * 如果三个参数都为null，即为查询所有，否则按条件查询
     *
     * @param empName 员工姓名
     * @return
     */
    List<Emps> selectName(@Param("empName") String empName);



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
