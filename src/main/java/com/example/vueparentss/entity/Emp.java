package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = -92242177097385437L;

    private Integer empId;

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSex='" + empSex + '\'' +
                ", empEdu='" + empEdu + '\'' +
                ", empTel='" + empTel + '\'' +
                ", titleId=" + titleId +
                ", postId=" + postId +
                ", deptId=" + deptId +
                ", empSosTel='" + empSosTel + '\'' +
                ", empSosName='" + empSosName + '\'' +
                ", baseMoney=" + baseMoney +
                ", workId=" + workId +
                ", wageItemId=" + wageItemId +
                '}';
    }

    private String empName;

    private String empSex;

    private String empEdu;

    private String empTel;

    private Integer titleId;
    private Integer postId;

    private Integer deptId;

    private String empSosTel;

    private String empSosName;

    private Object baseMoney;

    private Integer workId;

    private Integer wageItemId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getEmpEdu() {
        return empEdu;
    }

    public void setEmpEdu(String empEdu) {
        this.empEdu = empEdu;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmpSosTel() {
        return empSosTel;
    }

    public void setEmpSosTel(String empSosTel) {
        this.empSosTel = empSosTel;
    }

    public String getEmpSosName() {
        return empSosName;
    }

    public void setEmpSosName(String empSosName) {
        this.empSosName = empSosName;
    }

    public Object getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(Object baseMoney) {
        this.baseMoney = baseMoney;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getWageItemId() {
        return wageItemId;
    }

    public void setWageItemId(Integer wageItemId) {
        this.wageItemId = wageItemId;
    }




}