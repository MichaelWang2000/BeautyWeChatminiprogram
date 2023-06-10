package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.entity.Tecpro;
import com.cqut.beautifulapp.dao.TecproDao;
import com.cqut.beautifulapp.service.TecproService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Tecpro)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:59:39
 */
@Service("tecproService")
public class TecproServiceImpl implements TecproService {
    @Resource
    private TecproDao tecproDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Tecpro queryById(Long id) {
        return this.tecproDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tecpro      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Tecpro> queryByPage(Tecpro tecpro, PageRequest pageRequest) {
        long total = this.tecproDao.count(tecpro);
        return new PageImpl<>(this.tecproDao.queryAllByLimit(tecpro, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tecpro 实例对象
     * @return 实例对象
     */
    @Override
    public Tecpro insert(Tecpro tecpro) {
        this.tecproDao.insert(tecpro);
        return tecpro;
    }

    /**
     * 修改数据
     *
     * @param tecpro 实例对象
     * @return 实例对象
     */
    @Override
    public Tecpro update(Tecpro tecpro) {
        this.tecproDao.update(tecpro);
        return this.queryById(tecpro.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tecproDao.deleteById(id) > 0;
    }
}
