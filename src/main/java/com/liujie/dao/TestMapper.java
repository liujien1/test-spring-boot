package com.liujie.dao;

import com.liujie.entity.Stock;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: 刘杰.
 * Date: 2018-8-21.
 * Time: 14:33.
 * Explain:
 */
public interface TestMapper {

    @Select("select * from stock")
    public List<Stock> queryStock();

    public Stock selectByPrimaryKey(int id);
}
