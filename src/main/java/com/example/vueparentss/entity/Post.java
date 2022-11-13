package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (Post)实体类
 *
 * @author makejava
 * @since 2022-02-10 22:35:35
 */
public class Post implements Serializable {
    private static final long serialVersionUID = 633331117950765394L;
    
    private Integer postId;
    
    private String postName;
    
    private String postDesc;
    
    private double postSal;


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public double getPostSal() {
        return postSal;
    }

    public void setPostSal(double postSal) {
        this.postSal = postSal;
    }

}