package com.liujie.web;

import com.liujie.entity.Stock;
import com.liujie.service.TestService;
import com.liujie.utils.SpringUtil;
import com.liujie.utils.jedis.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * TestController
 *
 * @author 刘杰
 * @date 2018-8-21
 * @describe
 */
@RestController
public class TestController {

    //public static RedisUtil redisUtil = (RedisUtil) ContextLoader.getCurrentWebApplicationContext().getBean("redisUtil");

    @Resource
    private TestService testService;

    @RequestMapping("/testList")
    @ResponseBody
    public Object testListData() {

        List<Map<String, Object>> testList = new ArrayList<>();
        Map<String, Object> m1 = new HashMap<>(4);
        m1.put("col1", "第一行第一列");
        m1.put("col2", "第一行第二列");
        Map<String, Object> m2 = new HashMap<>(4);
        m2.put("col1", "第二行第一列");
        m2.put("col2", "第二行第二列");
        testList.add(m1);
        testList.add(m2);
        return testList;
    }

    /**
     * redis
     */
    @RequestMapping("/testRedis")
    public String testRedis() {
        RedisUtil redisUtil= (RedisUtil) SpringUtil.getBean("redisUtil");
        redisUtil.set("abc","123");
        System.out.println(redisUtil.get("abc"));
        return "testRedis";
    }

    @RequestMapping("/testDbData")
    public List testDbData(){
        return testService.queryStock();
    }

    @RequestMapping("/getStock")
    public Stock getStock(){
        return testService.queryStockById(1);
    }
}