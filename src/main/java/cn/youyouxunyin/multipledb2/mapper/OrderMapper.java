package cn.youyouxunyin.multipledb2.mapper;

import cn.youyouxunyin.multipledb2.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    void createOrder(Order order);
}
