package com.cqut.beautifulapp.entity;

import java.io.Serializable;

/**
 * (Project)实体类
 *
 * @author makejava
 * @since 2022-07-05 11:01:59
 */
public class Project implements Serializable {
    private static final long serialVersionUID = -69253623713816410L;
    /**
     * 项目id
     */
    private Long id;
    /**
     * 项目介绍
     */
    private String proexplain;
    /**
     * 项目价格
     */
    private Double proprice;
    /**
     * 项目步骤
     */
    private String prostep;
    /**
     * 关联项目类型id
     */
    private Long protypeid;
    /**
     * 项目名称
     */
    private String proname;
    /**
     * 关联图片id
     */
    private Long imageid;
    /**
     * 项目状态
     */
    private String prostatus;
    /**
     * 关联公司id
     */
    private Long busid;

    private Long tecid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProexplain() {
        return proexplain;
    }

    public void setProexplain(String proexplain) {
        this.proexplain = proexplain;
    }

    public Double getProprice() {
        return proprice;
    }

    public void setProprice(Double proprice) {
        this.proprice = proprice;
    }

    public String getProstep() {
        return prostep;
    }

    public void setProstep(String prostep) {
        this.prostep = prostep;
    }

    public Long getProtypeid() {
        return protypeid;
    }

    public void setProtypeid(Long protypeid) {
        this.protypeid = protypeid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    public String getProstatus() {
        return prostatus;
    }

    public void setProstatus(String prostatus) {
        this.prostatus = prostatus;
    }

    public Long getBusid() {
        return busid;
    }

    public void setBusid(Long busid) {
        this.busid = busid;
    }

    public Long getTecid() {
        return tecid;
    }

    public void setTecid(Long tecid) {
        this.tecid = tecid;
    }

}

