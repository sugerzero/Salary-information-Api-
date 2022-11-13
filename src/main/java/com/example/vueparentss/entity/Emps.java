package com.example.vueparentss.entity;

/**
 * @author : 沉默小多数
 * @date : 2020-08-26 11:23
 **/

import javafx.scene.control.CheckBox;

/**
 * Employee：员工实体类
 */
public class Emps {
    private Integer empId;
    private String empName;
    private String empSex;
    private String empEdu;
    private String  empTel;

    public Integer getChecksId() {
        return checksId;
    }

    public void setChecksId(Integer checksId) {
        this.checksId = checksId;
    }

     private Integer  checksId;
    private Integer titleId;
    private Integer postId;
    private Integer deptId;
    private String empSosTel;
    private String empSosName;
    private Double baseMoney;
    private Title title;//职称
    private Post post;//岗位
    private Dept dept;//部门
    private Checks checks;//

    @Override
    public String toString() {
        return "Emps{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSex='" + empSex + '\'' +
                ", empEdu='" + empEdu + '\'' +
                ", empTel='" + empTel + '\'' +
                ", checksId=" + checksId +
                ", titleId=" + titleId +
                ", postId=" + postId +
                ", deptId=" + deptId +
                ", empSosTel='" + empSosTel + '\'' +
                ", empSosName='" + empSosName + '\'' +
                ", baseMoney=" + baseMoney +
                ", title=" + title +
                ", post=" + post +
                ", dept=" + dept +
                ", checks=" + checks +
                '}';
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

    public Double getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(Double baseMoney) {
        this.baseMoney = baseMoney;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Checks getChecks() {
        return checks;
    }

    public void setChecks(Checks checks) {
        this.checks = checks;
    }


}
