package com.liujie.entity;

/**
 * Created with IntelliJ IDEA.
 * Author: 刘杰.
 * Date: 2018-7-23.
 * Time: 10:20.
 * Explain:
 */
import java.io.Serializable;

public class Stock implements Serializable{
    private static final long serialVersionUID = -8437012513227627973L;
    private Integer id;

    private String name;

    private Integer count;

    private Integer sale;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}