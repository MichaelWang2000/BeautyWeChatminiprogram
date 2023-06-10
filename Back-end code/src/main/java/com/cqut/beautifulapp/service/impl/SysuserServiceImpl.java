package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.dao.SysuserDao;
import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Sysuser;
import com.cqut.beautifulapp.service.SysuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sysuser)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:59:14
 */
@Service("sysuserService")
public class SysuserServiceImpl implements SysuserService {
    @Resource
    private SysuserDao sysuserDao;


    @Override
    public Boolean insert(Sysuser sysuser) {
        int i = sysuserDao.insert(sysuser);
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public List<Projects> queryProjects(Integer id) {

        List<Projects> users = null;
        if (id == 0) {
            users = sysuserDao.queryALL();
            return users;
        } else {
            users = sysuserDao.queryByid(id);
            return users;
        }
    }
}