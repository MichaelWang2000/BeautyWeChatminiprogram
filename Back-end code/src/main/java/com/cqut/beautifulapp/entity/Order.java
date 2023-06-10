package com.cqut.beautifulapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2022-07-05 10:57:03
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -44349018846807468L;
    /**
     * 订单id
     */
    private Long id;
    /**
     * 关联user表的openId
     */
    private String openid;
    /**
     * 项目名称
     */
    private String proname;
    /**
     * 预约时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "UTC+8")
    private Date makedate;
    /**
     * 预约客户姓名
     */
    private String username;
    /**
     * 预约状态
     */
    private String orderstate;
    /**
     * 下单时间
     */
    private Date placedate;
    /**
     * 手机号
     */
    private String usertell;
    /**
     * 留言
     */
    private String information;
    /**
     * 关联商家id
     */
    private Long busid;
    /**
     * 关联产品id
     */
    private Long proid;

    private Long tecid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public Date getPlacedate() {
        return placedate;
    }

    public void setPlacedate(Date placedate) {
        this.placedate = placedate;
    }

    public String getUsertell() {
        return usertell;
    }

    public void setUsertell(String usertell) {
        this.usertell = usertell;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Long getBusid() {
        return busid;
    }

    public void setBusid(Long busid) {
        this.busid = busid;
    }

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public Long getTecid() {
        return tecid;
    }

    public void setTecid(Long tecid) {
        this.tecid = tecid;
    }

}

