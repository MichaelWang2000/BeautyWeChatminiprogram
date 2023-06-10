package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Sysuser;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.SysuserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sysuser)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:59:14
 */
@RestController
@RequestMapping("sysuser")
public class SysuserController {
    /**
     * 服务对象
     */
    @Resource
    private SysuserService sysuserService;


    @ApiOperation(value = "insert",notes= "添加收藏")
    @ApiImplicitParam(name = "Sysuser",value = "收藏对象")
    @PostMapping("/app/Sysuser")
    public ResultData insert(@RequestBody Sysuser sysuser){

        //处理请求
        Boolean result =  sysuserService.insert(sysuser);
        if(result){
            return new ResultData(ResultCode.SUCCESS);
        }
        else {
            return new ResultData(ResultCode.FAILED);
        }
    }

    @ApiOperation(value = "queryProjects",notes = "通过id查找收藏")
    @ApiImplicitParam(name ="id",value="id")
    @GetMapping("/pro/{id}")
    public ResultData queryProjects(@PathVariable Integer id) {

        //处理请求
        List<Projects> projectList = sysuserService.queryProjects(id);
        ResultData resultData = new ResultData(ResultCode.SUCCESS, projectList);
        return resultData;
    }

}

