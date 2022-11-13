package com.example.vueparentss.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * (Checks)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:09:11
 */
public class Checks implements Serializable {
    private static final long serialVersionUID = -22289092624828946L;
    @Excel(name = "id号")
    private Integer checksId;
    
    private Integer deptId;
    @Excel(name = "工号")
    private Integer empId;
    @Excel(name = "月份")
    private String mon;
    @Excel(name = "病假")
    private Integer sickLeave;
    @Excel(name = "出差")
    private Integer affairLeave;
    @Excel(name = "事假")
    private Object usualHour;
    @Excel(name = "度假")
    private Object weekHour;
    @Excel(name = "周末")
    private Object holidayHour;
    @Excel(name = "迟到")
    private Integer late;
    @Excel(name = "早退")
    private Integer early;


    public Integer getChecksId() {
        return checksId;
    }

    public void setChecksId(Integer checksId) {
        this.checksId = checksId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public Integer getSickLeave() {
        return sickLeave;
    }

    public void setSickLeave(Integer sickLeave) {
        this.sickLeave = sickLeave;
    }

    public Integer getAffairLeave() {
        return affairLeave;
    }

    public void setAffairLeave(Integer affairLeave) {
        this.affairLeave = affairLeave;
    }

    public Object getUsualHour() {
        return usualHour;
    }

    public void setUsualHour(Object usualHour) {
        this.usualHour = usualHour;
    }

    public Object getWeekHour() {
        return weekHour;
    }

    public void setWeekHour(Object weekHour) {
        this.weekHour = weekHour;
    }

    public Object getHolidayHour() {
        return holidayHour;
    }

    public void setHolidayHour(Object holidayHour) {
        this.holidayHour = holidayHour;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getEarly() {
        return early;
    }

    public void setEarly(Integer early) {
        this.early = early;
    }

    @Override
    public String toString() {
        return "Checks{" +
                "checksId=" + checksId +
                ", deptId=" + deptId +
                ", empId=" + empId +
                ", mon='" + mon + '\'' +
                ", sickLeave=" + sickLeave +
                ", affairLeave=" + affairLeave +
                ", usualHour=" + usualHour +
                ", weekHour=" + weekHour +
                ", holidayHour=" + holidayHour +
                ", late=" + late +
                ", early=" + early +
                '}';
    }
}