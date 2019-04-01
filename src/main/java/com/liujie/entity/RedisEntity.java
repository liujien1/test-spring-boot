package com.liujie.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by liujie on 2017-5-9.
 */
@Component
@ConfigurationProperties(prefix="spring.redis")
//@Validated
public class RedisEntity {
    private String host;

    private int port;

    private int timeout;

    //@NotNull
    private int otherProperties;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getOtherProperties() {
        return otherProperties;
    }

    public void setOtherProperties(int otherProperties) {
        this.otherProperties = otherProperties;
    }
}
