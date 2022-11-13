package com.example.vueparentss.entity;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2022-02-11 19:02:59
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -63669331950312275L;
    //用户名
    private String account;
    //密码
    private String password;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}