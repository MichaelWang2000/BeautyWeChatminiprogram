package com.cqut.beautifulapp.entity;

import java.io.Serializable;

/**
 * (Image)实体类
 *
 * @author makejava
 * @since 2022-07-05 10:56:40
 */
public class Image implements Serializable {
    private static final long serialVersionUID = -38868764812976463L;
    /**
     * 图片id
     */
    private Long id;
    /**
     * 图片路径
     */
    private String imageurl;
    /**
     * 图片标题
     */
    private String imagetitle;
    /**
     * 图片类型 banner：首页轮播图 nav：菜单 head：头像
     */
    private String imagetype;
    /**
     * 图片状态  1：可用  0：不可用
     */
    private String imagestate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImagetitle() {
        return imagetitle;
    }

    public void setImagetitle(String imagetitle) {
        this.imagetitle = imagetitle;
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public String getImagestate() {
        return imagestate;
    }

    public void setImagestate(String imagestate) {
        this.imagestate = imagestate;
    }

}

