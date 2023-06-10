package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.dao.ProjecttypeDao;
import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Project;
import com.cqut.beautifulapp.dao.ProjectDao;
import com.cqut.beautifulapp.service.ProjectService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Project)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 11:01:59
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectDao projectDao;

    @Resource
    private ProjecttypeDao projecttypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Project queryById(Long id) {
        return this.projectDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param project     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Project> queryByPage(Project project, PageRequest pageRequest) {
        long total = this.projectDao.count(project);
        return new PageImpl<>(this.projectDao.queryAllByLimit(project, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    @Override
    public Project insert(Project project) {
        this.projectDao.insert(project);
        return project;
    }

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    @Override
    public Project update(Project project) {
        this.projectDao.update(project);
        return this.queryById(project.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.projectDao.deleteById(id) > 0;
    }


    /**
     * 通过项目类型名查找项目信息
     * @return
     */
    @Override
    public List<Projects> queryProjects(String name) {

        List<Projects> projectsList =null;
        if(name != null && !name.equals("")){
            if(name.equals("推荐")){
                projectsList = projectDao.queryAll();
                return projectsList;
            }else{
                //int tid = projecttypeDao.queryByName(name);
                projectsList = projectDao.queryByTid(name);
                return projectsList;
            }
        }
        return null;
    }


    /**
     * 通过项目的id查询项目信息
     * @param id
     * @return
     */
    @Override
    public Projects queryByPid(Integer id) {

        //获取数据
        return projectDao.queryByPid(id);
    }
}
