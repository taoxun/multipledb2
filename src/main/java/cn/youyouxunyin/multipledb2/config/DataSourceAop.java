package cn.youyouxunyin.multipledb2.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataSourceAop {

    @Before("execution(* cn.youyouxunyin.multipledb2.mapper.OrderMapper.*(..))")
    public void setDataSource1() {
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.ds1);
    }

    @Before("execution(* cn.youyouxunyin.multipledb2.mapper.StorageMapper.*(..))")
    public void setDataSource2() {
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.ds2);
    }
}
