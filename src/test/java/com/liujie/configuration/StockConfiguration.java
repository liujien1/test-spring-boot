package com.liujie.configuration;

import com.liujie.service.StockService;
import com.liujie.service.impl.StockServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘杰
 * @date 2019/4/1
 */
@Configuration
public class StockConfiguration {

    @Bean
    public StockService stockService(){
        return new StockServiceImpl();
    }
}
