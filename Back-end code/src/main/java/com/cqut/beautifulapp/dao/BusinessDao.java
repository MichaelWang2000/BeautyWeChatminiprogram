package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.entity.Business;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Business)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:46:03
 */
public interface BusinessDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Business queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param business 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Business> queryAllByLimit(Business business, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param business 查询条件
     * @return 总行数
     */
    long count(Business business);

    /**
     * 新增数据
     *
     * @param business 实例对象
     * @return 影响行数
     */
    int insert(Business business);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Business> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Business> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Business> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Business> entities);

    /**
     * 修改数据
     *
     * @param business 实例对象
     * @return 影响行数
     */
    int update(Business business);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    String queryByBid(Integer id);
}

