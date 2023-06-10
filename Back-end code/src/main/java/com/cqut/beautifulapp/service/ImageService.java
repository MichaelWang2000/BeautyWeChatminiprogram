package com.cqut.beautifulapp.service;

import com.cqut.beautifulapp.entity.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Image)表服务接口
 *
 * @author makejava
 * @since 2022-07-05 10:56:40
 */
public interface ImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Image queryById(Long id);

    /**
     * 分页查询
     *
     * @param image       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Image> queryByPage(Image image, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param image 实例对象
     * @return 实例对象
     */
    Image insert(Image image);

    /**
     * 修改数据
     *
     * @param image 实例对象
     * @return 实例对象
     */
    Image update(Image image);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过图片类型imagetype 查找轮播图
     * @param imagetype
     * @return
     */

    List<Image> queryByType(String imagetype);
}
