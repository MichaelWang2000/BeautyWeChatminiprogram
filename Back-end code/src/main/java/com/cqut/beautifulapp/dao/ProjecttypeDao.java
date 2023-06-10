package com.cqut.beautifulapp.dao;

import com.cqut.beautifulapp.entity.Projecttype;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Projecttype)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-05 10:59:02
 */
public interface ProjecttypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Projecttype queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param projecttype 查询条件
     * @param pageable    分页对象
     * @return 对象列表
     */
    List<Projecttype> queryAllByLimit(Projecttype projecttype, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param projecttype 查询条件
     * @return 总行数
     */
    long count(Projecttype projecttype);

    /**
     * 新增数据
     *
     * @param projecttype 实例对象
     * @return 影响行数
     */
    int insert(Projecttype projecttype);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Projecttype> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Projecttype> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Projecttype> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Projecttype> entities);

    /**
     * 修改数据
     *
     * @param projecttype 实例对象
     * @return 影响行数
     */
    int update(Projecttype projecttype);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 通过项目类名查找id
     * @param name
     * @return
     */
    int queryByName(String name);
}

