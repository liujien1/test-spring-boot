package com.liujie.service.impl;

import com.liujie.dao.StockMapper;
import com.liujie.entity.Stock;
import com.liujie.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: 刘杰.
 * Date: 2018-8-21.
 * Time: 14:45.
 * Explain:
 */
@Service
public class StockServiceImpl implements StockService {



    @Autowired
    private StockMapper stockMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void placeOrder() {

    }

    @Override
    public List<Stock> queryStock() {

        return stockMapper.queryStock();
    }


    @Override
    public Stock queryStockById(int id) {

        return null;
    }
}
