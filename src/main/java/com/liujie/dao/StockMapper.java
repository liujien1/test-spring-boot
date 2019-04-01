package com.liujie.dao;

/**
 * Created with IntelliJ IDEA.
 * Author: 刘杰.
 * Date: 2018-7-23.
 * Time: 10:18.
 * Explain:
 */

import com.liujie.entity.Stock;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StockMapper{

    @Select("select * from stock")
    public List<Stock> queryStock();

}