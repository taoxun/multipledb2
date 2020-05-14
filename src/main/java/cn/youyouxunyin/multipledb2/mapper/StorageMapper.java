package cn.youyouxunyin.multipledb2.mapper;

import cn.youyouxunyin.multipledb2.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageMapper {

    void decreaseStorage(Order order);
}
