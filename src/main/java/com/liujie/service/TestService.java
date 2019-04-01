package com.liujie.service;

import com.liujie.entity.Stock;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: 刘杰.
 * Date: 2018-8-21.
 * Time: 14:43.
 * Explain:
 */
public interface TestService {

    public void placeOrder();

    /**
     * 查询库存
     * @return
     */
    public List<Stock> queryStock();

    public Stock queryStockById(int id);
}
