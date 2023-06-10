package com.cqut.beautifulapp.service;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Sysuser;

import java.util.List;

/**
 * (Sysuser)表服务接口
 *
 * @author makejava
 * @since 2022-07-05 10:59:14
 */
public interface SysuserService {


    Boolean insert(Sysuser sysuser) ;

    List<Projects> queryProjects(Integer id);



}
