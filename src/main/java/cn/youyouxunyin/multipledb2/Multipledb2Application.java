package cn.youyouxunyin.multipledb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.youyouxunyin.multipledb2.mapper")
public class Multipledb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Multipledb2Application.class, args);
    }

}
