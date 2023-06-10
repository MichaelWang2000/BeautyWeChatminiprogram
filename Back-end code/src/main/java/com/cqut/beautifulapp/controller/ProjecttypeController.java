package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.entity.Projecttype;
import com.cqut.beautifulapp.service.ProjecttypeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Projecttype)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:59:02
 */
@RestController
@RequestMapping("projecttype")
public class ProjecttypeController {
    /**
     * 服务对象
     */
    @Resource
    private ProjecttypeService projecttypeService;

    /**
     * 分页查询
     *
     * @param projecttype 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Projecttype>> queryByPage(Projecttype projecttype, PageRequest pageRequest) {
        return ResponseEntity.ok(this.projecttypeService.queryByPage(projecttype, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Projecttype> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.projecttypeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param projecttype 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Projecttype> add(Projecttype projecttype) {
        return ResponseEntity.ok(this.projecttypeService.insert(projecttype));
    }

    /**
     * 编辑数据
     *
     * @param projecttype 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Projecttype> edit(Projecttype projecttype) {
        return ResponseEntity.ok(this.projecttypeService.update(projecttype));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.projecttypeService.deleteById(id));
    }

}

