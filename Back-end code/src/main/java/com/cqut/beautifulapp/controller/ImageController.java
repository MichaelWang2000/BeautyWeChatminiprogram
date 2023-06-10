package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.entity.Image;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.ImageService;
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
 * (Image)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:56:40
 */
@RestController
@RequestMapping("image")
@Api(tags = "图片")
public class ImageController {

    /**
    *服务层imageservice对象
     */
    @Resource
    private ImageService imageService;


    /**
     * 通过图片类型查找轮播图
     * @param imagetype
     * @return
     */
    @ApiOperation(value = "queryByType",notes = "通过图片类型查找图片信息")
    @ApiImplicitParam(name ="imagetype",value="图片类型")

    @GetMapping("/{imagetype}")
    public ResultData queryByType(@PathVariable String imagetype){

        //处理请求 service 层
        List<Image> images =  imageService.queryByType(imagetype);
        ResultData resultData = new ResultData(ResultCode.SUCCESS,images);

        return resultData;
    }
}

