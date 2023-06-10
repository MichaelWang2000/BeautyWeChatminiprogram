package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.entity.Image;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Image)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:56:40
 */
public interface ImageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Image queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param image    查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Image> queryAllByLimit(Image image, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param image 查询条件
     * @return 总行数
     */
    long count(Image image);

    /**
     * 新增数据
     *
     * @param image 实例对象
     * @return 影响行数
     */
    int insert(Image image);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Image> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Image> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Image> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Image> entities);

    /**
     * 修改数据
     *
     * @param image 实例对象
     * @return 影响行数
     */
    int update(Image image);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 通过图片类型获取轮播图
     * @param imagetype
     * @return
     */
    List<Image> queryByType(String imagetype);
}

