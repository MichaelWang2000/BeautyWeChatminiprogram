package com.cqut.beautifulapp.entity;

import java.io.Serializable;

/**
 * (Projecttype)实体类
 *
 * @author makejava
 * @since 2022-07-05 10:59:02
 */
public class Projecttype implements Serializable {
    private static final long serialVersionUID = -15400630467334628L;
    /**
     * 项目类型id
     */
    private Long id;
    /**
     * 项目类型
     */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

