package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (Title)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:36
 */
public class Title implements Serializable {
    private static final long serialVersionUID = -52610710902592916L;
    
    private Integer titleId;
    
    private String titleName;
    
    private Object titleSal;


    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public Object getTitleSal() {
        return titleSal;
    }

    public void setTitleSal(Object titleSal) {
        this.titleSal = titleSal;
    }

}