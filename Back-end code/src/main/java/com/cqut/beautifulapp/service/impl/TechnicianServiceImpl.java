package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Technician;
import com.cqut.beautifulapp.dao.TechnicianDao;
import com.cqut.beautifulapp.service.TechnicianService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Technician)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:59:26
 */
@Service("technicianService")
public class TechnicianServiceImpl implements TechnicianService {
    @Resource
    private TechnicianDao technicianDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Technician queryById(Long id) {
        return this.technicianDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param technician  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Technician> queryByPage(Technician technician, PageRequest pageRequest) {
        long total = this.technicianDao.count(technician);
        return new PageImpl<>(this.technicianDao.queryAllByLimit(technician, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param technician 实例对象
     * @return 实例对象
     */
    @Override
    public Technician insert(Technician technician) {
        this.technicianDao.insert(technician);
        return technician;
    }

    /**
     * 修改数据
     *
     * @param technician 实例对象
     * @return 实例对象
     */
    @Override
    public Technician update(Technician technician) {
        this.technicianDao.update(technician);
        return this.queryById(technician.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.technicianDao.deleteById(id) > 0;
    }


    /**
     *
     * @param name
     * @return
     */
    @Override
    public List<Projects> queryTeacher(String name) {
        List<Projects> TeachersList =null;
        if(name != null && !name.equals("")){
            if(name.equals("我全都要")){
                TeachersList = technicianDao.queryAll();
                return TeachersList;
            }else{
                TeachersList = technicianDao.queryByTid(name);
                return TeachersList;
            }
        }
        return null;
    }

    @Override
    public List<Projects> queryTeacherOrder(Long id) {
        List<Projects> TeachersListorder = null;
        if(id != 0){
            TeachersListorder = technicianDao.queryTeacherOrder(id);
            return TeachersListorder;
        }
        return null;
    }

}
