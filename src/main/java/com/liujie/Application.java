package com.liujie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016-12-12.
 */
@SpringBootApplication
@ComponentScan("com.liujie")
@MapperScan("com.liujie.dao")
public class Application  {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        //SpringApplication app = new SpringApplication(Application.class);
        //app.setBannerMode(Banner.Mode.OFF);
        //app.addListeners(new MyListener());
        //app.run(args);
    }
}