package com.example.vueparentss.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.io.Serializable;
import java.util.Date;

/**
 * (Salary)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */


public class Salary implements Serializable {
    private static final long serialVersionUID = 854187331660423139L;
   
    private Integer salId;
    @Excel(name = "月份")//@Excel设置表里的表头名
    private String mon;
    @Excel(name = "员号")//@Excel设置表里的表头名
    private Integer empId;
    @Excel(name = "员工姓名")//@Excel设置表里的表头名
    private String empName;

    private Integer deptId;
    @Excel(name = "实发工资")//@Excel设置表里的表头名
    private double realSal;
    @Excel(name = "应发工资")//@Excel设置表里的表头名
    private double shouldSal;
    @Excel(name = "基础工资")//@Excel设置表里的表头名
    private double baseMoney;
    @Excel(name = "出差补贴")//@Excel设置表里的表头名
    private double businessTripSal;
    @Excel(name = "部门补贴")//@Excel设置表里的表头名
    private double postSal;
    @Excel(name = "餐补")//@Excel设置表里的表头名
    private double foodSal;
    @Excel(name = "交通补助")//@Excel设置表里的表头名
    private double trafficSal;
    @Excel(name = "全勤奖")//@Excel设置表里的表头名
    private double overtimeSal;
    @Excel(name = "职称奖金")//@Excel设置表里的表头名
    private double titleSal;
    @Excel(name = "工龄补助")//@Excel设置表里的表头名
    private double workSal;

    private Integer state;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public double getRealSal() {
        return realSal;
    }

    public void setRealSal(double realSal) {
        this.realSal = realSal;
    }

    public double getShouldSal() {
        return shouldSal;
    }

    public void setShouldSal(double shouldSal) {
        this.shouldSal = shouldSal;
    }

    public double getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(double baseMoney) {
        this.baseMoney = baseMoney;
    }

    public double getBusinessTripSal() {
        return businessTripSal;
    }

    public void setBusinessTripSal(double businessTripSal) {
        this.businessTripSal = businessTripSal;
    }

    public double getPostSal() {
        return postSal;
    }

    public void setPostSal(double postSal) {
        this.postSal = postSal;
    }

    public double getFoodSal() {
        return foodSal;
    }

    public void setFoodSal(double foodSal) {
        this.foodSal = foodSal;
    }

    public double getTrafficSal() {
        return trafficSal;
    }

    public void setTrafficSal(double trafficSal) {
        this.trafficSal = trafficSal;
    }

    public double getOvertimeSal() {
        return overtimeSal;
    }

    public void setOvertimeSal(double overtimeSal) {
        this.overtimeSal = overtimeSal;
    }

    public double getTitleSal() {
        return titleSal;
    }

    public void setTitleSal(double titleSal) {
        this.titleSal = titleSal;
    }

    public double getWorkSal() {
        return workSal;
    }

    public void setWorkSal(double workSal) {
        this.workSal = workSal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}