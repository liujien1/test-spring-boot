package com.liujie.service.impl;

import com.liujie.dao.StockMapper;
import com.liujie.dao.TestMapper;
import com.liujie.entity.Stock;
import com.liujie.service.TestService;
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
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper testMapper;

    @Autowired
    private StockMapper stockMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void placeOrder() {

    }

    @Override
    public List<Stock> queryStock() {

        return testMapper.queryStock();
    }


    @Override
    public Stock queryStockById(int id) {

        return null;
    }
}
