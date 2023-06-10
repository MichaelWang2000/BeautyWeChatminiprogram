package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.entity.Business;
import com.cqut.beautifulapp.dao.BusinessDao;
import com.cqut.beautifulapp.service.BusinessService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Business)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:46:03
 */
@Service("businessService")
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessDao businessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Business queryById(Long id) {
        return this.businessDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param business    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Business> queryByPage(Business business, PageRequest pageRequest) {
        long total = this.businessDao.count(business);
        return new PageImpl<>(this.businessDao.queryAllByLimit(business, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param business 实例对象
     * @return 实例对象
     */
    @Override
    public Business insert(Business business) {
        this.businessDao.insert(business);
        return business;
    }

    /**
     * 修改数据
     *
     * @param business 实例对象
     * @return 实例对象
     */
    @Override
    public Business update(Business business) {
        this.businessDao.update(business);
        return this.queryById(business.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.businessDao.deleteById(id) > 0;
    }

    /**
     * 通过id  查找商家名
     * @param id
     * @return
     */
    @Override
    public String queryByBid(Integer id) {
        return businessDao.queryByBid(id);
    }
}
