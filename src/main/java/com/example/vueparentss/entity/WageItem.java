package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (WageItem)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public class WageItem implements Serializable {
    private static final long serialVersionUID = -58987686078256505L;
    
    private Integer wageItemId;
    
    private Object lateFine;
    
    private Object earlyFine;
    
    private Object businessTripSal;
    
    private Object fulChecksSal;
    
    private Object foodSal;
    
    private Object trafficSal;
    
    private Object usualSal;
    
    private Object weekSal;
    
    private Object holidaySal;


    public Integer getWageItemId() {
        return wageItemId;
    }

    public void setWageItemId(Integer wageItemId) {
        this.wageItemId = wageItemId;
    }

    public Object getLateFine() {
        return lateFine;
    }

    public void setLateFine(Object lateFine) {
        this.lateFine = lateFine;
    }

    public Object getEarlyFine() {
        return earlyFine;
    }

    public void setEarlyFine(Object earlyFine) {
        this.earlyFine = earlyFine;
    }

    public Object getBusinessTripSal() {
        return businessTripSal;
    }

    public void setBusinessTripSal(Object businessTripSal) {
        this.businessTripSal = businessTripSal;
    }

    public Object getFulChecksSal() {
        return fulChecksSal;
    }

    public void setFulChecksSal(Object fulChecksSal) {
        this.fulChecksSal = fulChecksSal;
    }

    public Object getFoodSal() {
        return foodSal;
    }

    public void setFoodSal(Object foodSal) {
        this.foodSal = foodSal;
    }

    public Object getTrafficSal() {
        return trafficSal;
    }

    public void setTrafficSal(Object trafficSal) {
        this.trafficSal = trafficSal;
    }

    public Object getUsualSal() {
        return usualSal;
    }

    public void setUsualSal(Object usualSal) {
        this.usualSal = usualSal;
    }

    public Object getWeekSal() {
        return weekSal;
    }

    public void setWeekSal(Object weekSal) {
        this.weekSal = weekSal;
    }

    public Object getHolidaySal() {
        return holidaySal;
    }

    public void setHolidaySal(Object holidaySal) {
        this.holidaySal = holidaySal;
    }

}