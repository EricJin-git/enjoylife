package com.jk.enjoylife;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication  //(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.jk.enjoylife.Dao")
public class EnjoylifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnjoylifeApplication.class, args);
    }

}
