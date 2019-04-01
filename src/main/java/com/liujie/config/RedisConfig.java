package com.liujie.config;

import com.liujie.entity.RedisEntity;
import com.liujie.utils.jedis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author jie
 * @date 2019-3-25
 */
@Configuration
public class RedisConfig {

    @Autowired
    public RedisEntity redisEntity;

    @Bean
    public JedisPoolConfig jedisPoolConfig(){

        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        jedisPoolConfig.setMaxActive(1024);
        jedisPoolConfig.setMaxIdle(200);
        jedisPoolConfig.setMaxWait(1000);
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPoolConfig.setTestOnReturn(true);
        return jedisPoolConfig;
    }

    @Bean
    public JedisPool jedisPool(){
        JedisPool jedisPool=new JedisPool(jedisPoolConfig,redisEntity.getHost(),redisEntity.getPort(),redisEntity.getTimeout());
        return jedisPool;
    }

    @Bean
    public RedisUtil redisUtil(){
        RedisUtil redisUtil=new RedisUtil();
        redisUtil.setJedisPool(jedisPool);
        return redisUtil;
    }

    @Autowired
    private JedisPoolConfig jedisPoolConfig;

    @Autowired
    private JedisPool jedisPool;

    @Autowired
    private RedisUtil redisUtil;
}
