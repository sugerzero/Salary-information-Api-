package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (WorkTimes)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public class WorkTimes implements Serializable {
    private static final long serialVersionUID = -49022034095672044L;
    
    private Integer workId;
    
    private Integer workYears;
    
    private Object workSal;


    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Integer workYears) {
        this.workYears = workYears;
    }

    public Object getWorkSal() {
        return workSal;
    }

    public void setWorkSal(Object workSal) {
        this.workSal = workSal;
    }

}