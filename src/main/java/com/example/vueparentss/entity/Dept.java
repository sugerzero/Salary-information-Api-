package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = -39953680517614280L;
    
    private Integer deptId;
    
    private String deptName;
    
    private String deptDesc;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public Dept() {
    }

    public Dept(Integer deptId, String deptName, String deptDesc) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptDesc = deptDesc;
    }
    public Dept( String deptName, String deptDesc) {

        this.deptName = deptName;
        this.deptDesc = deptDesc;
    }
}