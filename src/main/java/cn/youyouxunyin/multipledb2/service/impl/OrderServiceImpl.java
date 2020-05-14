package cn.youyouxunyin.multipledb2.service.impl;

import cn.youyouxunyin.multipledb2.entity.Order;
import cn.youyouxunyin.multipledb2.mapper.OrderMapper;
import cn.youyouxunyin.multipledb2.mapper.StorageMapper;
import cn.youyouxunyin.multipledb2.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    StorageMapper storageMapper;


    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Transactional
    @Override
    public void createOrder(Order order) {
        storageMapper.decreaseStorage(order);
        int k = 1/0;
        logger.info("库存已扣减，商品代码:{}，购买数量:{}。创建订单中...",order.getCommodityCode(),order.getCount());
        orderMapper.createOrder(order);
    }
}
