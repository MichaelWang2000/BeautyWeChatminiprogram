package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Sysuser;

import java.util.List;

/**
 * (Sysuser)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:59:14
 */
public interface SysuserDao {

    List<Projects> queryALL();

    List<Projects> queryByid(Integer id);
    int insert(Sysuser sysuser);


}

