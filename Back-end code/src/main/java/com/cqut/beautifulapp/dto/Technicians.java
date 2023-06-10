package com.cqut.beautifulapp.dto;

import com.cqut.beautifulapp.entity.Technician;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Technicians extends Technician {

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

    public Technicians(){

    }

    public Technicians(String proname, Date makedate, String username) {
        this.proname = proname;
        this.makedate = makedate;
        this.username = username;
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
}
