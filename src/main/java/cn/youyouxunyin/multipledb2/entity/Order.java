package cn.youyouxunyin.multipledb2.entity;

import lombok.Data;

@Data
public class Order {
    private long id;
    private String commodityCode;
    private int count;
    private double amount;
}
