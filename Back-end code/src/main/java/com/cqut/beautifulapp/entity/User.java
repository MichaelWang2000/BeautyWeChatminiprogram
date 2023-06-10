package com.cqut.beautifulapp.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-07-05 10:59:50
 */
public class User implements Serializable {
    private static final long serialVersionUID = -91172136078444608L;
    /**
     * 用户id
     */
    private Long id;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 微信用户唯一标识
     */
    private String openid;
    /**
     * 微信头像路径
     */
    private String imageurl;

    private String sessionkey;

    private String token;

    private String username;

    private String phone;

    private String password;

    private String systoken;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSystoken() {
        return systoken;
    }

    public void setSystoken(String systoken) {
        this.systoken = systoken;
    }

}

