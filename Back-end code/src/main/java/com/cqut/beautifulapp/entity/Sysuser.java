package com.cqut.beautifulapp.entity;

import java.io.Serializable;

/**
 * (Sysuser)实体类
 *
 * @author makejava
 * @since 2022-07-05 10:59:14
 */
public class Sysuser implements Serializable {
    private static final long serialVersionUID = -14376269915043674L;
    /**
     * 系统用户id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 关联图片id
     */
    private Long imageid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

}

