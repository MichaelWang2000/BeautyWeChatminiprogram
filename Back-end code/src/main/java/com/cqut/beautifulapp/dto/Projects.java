package com.cqut.beautifulapp.dto;

import com.cqut.beautifulapp.entity.Project;

public class Projects extends Project {

    private String imageurl;

    public Projects(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
