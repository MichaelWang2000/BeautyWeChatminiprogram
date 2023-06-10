package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Project)表控制层
 *
 * @author makejava
 * @since 2022-07-05 11:01:59
 */
@RestController
@RequestMapping("project")
@Api(tags = "项目")
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;

//    /**
//     * 分页查询
//     *
//     * @param project     筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<Project>> queryByPage(Project project, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.projectService.queryByPage(project, pageRequest));
//    }
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("{id}")
//    public ResponseEntity<Project> queryById(@PathVariable("id") Long id) {
//        return ResponseEntity.ok(this.projectService.queryById(id));
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param project 实体
//     * @return 新增结果
//     */
//    @PostMapping
//    public ResponseEntity<Project> add(Project project) {
//        return ResponseEntity.ok(this.projectService.insert(project));
//    }
//
//    /**
//     * 编辑数据
//     *
//     * @param project 实体
//     * @return 编辑结果
//     */
//    @PutMapping
//    public ResponseEntity<Project> edit(Project project) {
//        return ResponseEntity.ok(this.projectService.update(project));
//    }
//
//    /**
//     * 删除数据
//     *
//     * @param id 主键
//     * @return 删除是否成功
//     */
//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById(Long id) {
//        return ResponseEntity.ok(this.projectService.deleteById(id));
//    }


    /**
     *通过项目类型查询项目信息
     * @param name
     * @return
     */
    @ApiOperation(value = "queryProjects",notes = "通过项目导航栏的类型名查询对应项目信息")
    @ApiImplicitParam(name ="name",value="项目类型名")
    @GetMapping("/pro/{name}")
    public ResultData queryProjects(@PathVariable String name){

        //处理请求
        List<Projects> projectList = projectService.queryProjects(name);
        ResultData resultData =new ResultData(ResultCode.SUCCESS,projectList);
        return resultData;
    }


    /**
     * 通过项目的id查询项目信息
     * @param id
     * @return
     */
    @ApiOperation(value = "queryByPid",notes= "通过项目的id查找对应项目信息")
    @ApiImplicitParam(name = "id",value = "项目的id")
    @GetMapping("/detail/{id}")
    public ResultData queryByPid(@PathVariable Integer id){

        //处理请求
        Projects projects =  projectService.queryByPid(id);

        return new ResultData(ResultCode.SUCCESS,projects);
    }
}

