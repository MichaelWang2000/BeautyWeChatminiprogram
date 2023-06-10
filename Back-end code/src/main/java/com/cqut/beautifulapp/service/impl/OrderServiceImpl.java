package com.cqut.beautifulapp.service.impl;

import com.cqut.beautifulapp.dao.OrderDao;
import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Order;
import com.cqut.beautifulapp.service.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2022-07-05 10:57:03
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean insertwithTeacher(Order order) {
        int i = orderDao.insertwithTeacher(order);
        if(i == 1){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Long id) {
        return this.orderDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param order       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Order> queryByPage(Order order, PageRequest pageRequest) {
        long total = this.orderDao.count(order);
        return new PageImpl<>(this.orderDao.queryAllByLimit(order, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean insert(Order order) {
        int i = orderDao.insert(order);
        if(i == 1){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Order update(Order order) {
        this.orderDao.update(order);
        return this.queryById(order.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderDao.deleteById(id) > 0;
    }


    @Override
    public List<Projects> queryProjects(String name) {
        {
            List<Projects> users = null;
            if (name != null && !name.equals((""))) {

                users = orderDao.queryByTid(name);
                return users;
            }
        }

        return null;
    }
}
