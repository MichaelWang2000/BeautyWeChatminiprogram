package com.cqut.beautifulapp.controller;

import com.cqut.beautifulapp.dto.Projects;
import com.cqut.beautifulapp.entity.Order;
import com.cqut.beautifulapp.result.ResultCode;
import com.cqut.beautifulapp.result.ResultData;
import com.cqut.beautifulapp.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2022-07-05 10:57:03
 */
@RestController
@RequestMapping("order")
@Api(tags = "订单")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;


    @ApiOperation(value = "insert",notes = "添加的订单")
    @ApiImplicitParam(name ="order",value="订单对象")
    @PostMapping("/app/order")
    public ResultData insert(@RequestBody Order order){

        //处理请求
        Boolean result = orderService.insert(order);
        if(result) {
            return new ResultData(ResultCode.SUCCESS);
        }else{
            return new ResultData(ResultCode.FAILED);
        }
    }


    /**
     * 添加带技师的订单
     * @param order
     * @return
     */
    @ApiOperation(value = "insertwithTeacher",notes = "添加带技师的订单")
    @ApiImplicitParam(name ="order",value="订单对象")
    @PostMapping("/app/teachorder")
    public ResultData insertwithTeacher(@RequestBody Order order){

        //处理请求
        Boolean result = orderService.insertwithTeacher(order);
        if(result) {
            return new ResultData(ResultCode.SUCCESS);
        }else{
            return new ResultData(ResultCode.FAILED);
        }
    }

    /**
     * 通过名字查找订单
     * @param name
     * @return
     */
    @ApiOperation(value = "queryProjects",notes = "通过名称查找订单")
    @ApiImplicitParam(name ="name",value="名字")
    @GetMapping("/pro/{name}")
    public ResultData queryProjects(@PathVariable String name) {

        //处理请求
        List<Projects> projectList = orderService.queryProjects(name);
        ResultData resultData = new ResultData(ResultCode.SUCCESS, projectList);
        return resultData;
    }





//    /**
//     * 分页查询
//     *
//     * @param order       筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    @GetMapping
//    public ResponseEntity<Page<Order>> queryByPage(Order order, PageRequest pageRequest) {
//        return ResponseEntity.ok(this.orderService.queryByPage(order, pageRequest));
//    }
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("{id}")
//    public ResponseEntity<Order> queryById(@PathVariable("id") Long id) {
//        return ResponseEntity.ok(this.orderService.queryById(id));
//    }
//
//
//
//    /**
//     * 编辑数据
//     *
//     * @param order 实体
//     * @return 编辑结果
//     */
//    @PutMapping
//    public ResponseEntity<Order> edit(Order order) {
//        return ResponseEntity.ok(this.orderService.update(order));
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
//        return ResponseEntity.ok(this.orderService.deleteById(id));
//    }

}

