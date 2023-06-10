package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.entity.Projecttype;
import com.cqut.beautifulapp.dao.ProjecttypeDao;
import com.cqut.beautifulapp.service.ProjecttypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Projecttype)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:59:03
 */
@Service("projecttypeService")
public class ProjecttypeServiceImpl implements ProjecttypeService {
    @Resource
    private ProjecttypeDao projecttypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Projecttype queryById(Long id) {
        return this.projecttypeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param projecttype 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Projecttype> queryByPage(Projecttype projecttype, PageRequest pageRequest) {
        long total = this.projecttypeDao.count(projecttype);
        return new PageImpl<>(this.projecttypeDao.queryAllByLimit(projecttype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param projecttype 实例对象
     * @return 实例对象
     */
    @Override
    public Projecttype insert(Projecttype projecttype) {
        this.projecttypeDao.insert(projecttype);
        return projecttype;
    }

    /**
     * 修改数据
     *
     * @param projecttype 实例对象
     * @return 实例对象
     */
    @Override
    public Projecttype update(Projecttype projecttype) {
        this.projecttypeDao.update(projecttype);
        return this.queryById(projecttype.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.projecttypeDao.deleteById(id) > 0;
    }
}
