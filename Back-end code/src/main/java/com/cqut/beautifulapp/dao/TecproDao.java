package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.entity.Tecpro;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Tecpro)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:59:39
 */
public interface TecproDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Tecpro queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param tecpro   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Tecpro> queryAllByLimit(Tecpro tecpro, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tecpro 查询条件
     * @return 总行数
     */
    long count(Tecpro tecpro);

    /**
     * 新增数据
     *
     * @param tecpro 实例对象
     * @return 影响行数
     */
    int insert(Tecpro tecpro);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tecpro> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Tecpro> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tecpro> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Tecpro> entities);

    /**
     * 修改数据
     *
     * @param tecpro 实例对象
     * @return 影响行数
     */
    int update(Tecpro tecpro);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

