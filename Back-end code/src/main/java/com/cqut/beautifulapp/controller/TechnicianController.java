package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.TechnicianService;
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
 * (Technician)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:59:26
 */
@RestController
@RequestMapping("technician")
@Api(tags = "技师")
public class TechnicianController {
    /**
     * 服务对象
     */
    @Resource
    private TechnicianService technicianService;

//    /**
//     * 分页查询
//     *
//     * @param technician  筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<Technician>> queryByPage(Technician technician, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.technicianService.queryByPage(technician, pageRequest));
//    }
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("{id}")
//    public ResponseEntity<Technician> queryById(@PathVariable("id") Long id) {
//        return ResponseEntity.ok(this.technicianService.queryById(id));
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param technician 实体
//     * @return 新增结果
//     */
//    @PostMapping
//    public ResponseEntity<Technician> add(Technician technician) {
//        return ResponseEntity.ok(this.technicianService.insert(technician));
//    }
//
//    /**
//     * 编辑数据
//     *
//     * @param technician 实体
//     * @return 编辑结果
//     */
//    @PutMapping
//    public ResponseEntity<Technician> edit(Technician technician) {
//        return ResponseEntity.ok(this.technicianService.update(technician));
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
//        return ResponseEntity.ok(this.technicianService.deleteById(id));
//    }

    /**
     * 查询技师
     * @param name
     * @return
     */

    @ApiOperation(value = "queryTeacher",notes = "查询技师")
    @ApiImplicitParam(name ="name",value="技师名称")
    @GetMapping("/teach/teacher/{name}")
    public ResultData queryTeacher(@PathVariable String name){
        //处理请求
        List<Projects> projectList = technicianService.queryTeacher(name);
        ResultData resultData =new ResultData(ResultCode.SUCCESS,projectList);
        return resultData;
    }


    /**
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "queryTeacherOrder",notes = "查询技师相关订单")
    @ApiImplicitParam(name ="id",value="技师id")
    @GetMapping("/teacher/{id}")
    public ResultData queryTeacherOrder(@PathVariable Long id){
        //处理请求
        List<Projects> projectList = technicianService.queryTeacherOrder(id);
        ResultData resultData =new ResultData(ResultCode.SUCCESS,projectList);
        return resultData;
    }


}

