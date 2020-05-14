package cn.youyouxunyin.multipledb2.controller;

import cn.hutool.core.lang.Snowflake;
import cn.youyouxunyin.multipledb2.entity.Order;
import cn.youyouxunyin.multipledb2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    Snowflake snowflake = new Snowflake(1,1);


    @RequestMapping("/createOrder")
    public Order createOrder(@RequestBody Order order){
        order.setId(snowflake.nextId());
        order.setAmount(order.getCount()*10);
        orderService.createOrder(order);
        return order;
    }
}
