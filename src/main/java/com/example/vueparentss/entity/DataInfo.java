package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (DataInfo)实体类
 *
 * @author makejava
 * @since 2022-02-11 19:03:11
 */
public class DataInfo implements Serializable {
    private static final long serialVersionUID = 769641315051344237L;
    
    private Integer deptId;
    
    private String mon;
    
    private String deptName;
    
    private Object minSal;
    
    private Object avgSal;
    
    private Object maxSal;
    
    private Object sumSal;
    
    private Object allSal;
    
    private Object salRatio;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Object getMinSal() {
        return minSal;
    }

    public void setMinSal(Object minSal) {
        this.minSal = minSal;
    }

    public Object getAvgSal() {
        return avgSal;
    }

    public void setAvgSal(Object avgSal) {
        this.avgSal = avgSal;
    }

    public Object getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(Object maxSal) {
        this.maxSal = maxSal;
    }

    public Object getSumSal() {
        return sumSal;
    }

    public void setSumSal(Object sumSal) {
        this.sumSal = sumSal;
    }

    public Object getAllSal() {
        return allSal;
    }

    public void setAllSal(Object allSal) {
        this.allSal = allSal;
    }

    public Object getSalRatio() {
        return salRatio;
    }

    public void setSalRatio(Object salRatio) {
        this.salRatio = salRatio;
    }

}