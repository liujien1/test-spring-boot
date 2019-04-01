package com.liujie.web;

import com.liujie.entity.Stock;
import com.liujie.service.StockService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 刘杰
 * @date 2019/4/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleServiceTest {

    @Autowired
    private StockService stockService;

    @Test
    public void test1(){
        List<Stock> list=stockService.queryStock();

        Assert.assertTrue(list.size()==1);
    }
}
