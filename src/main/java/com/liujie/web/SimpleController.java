package com.liujie.web;

import com.liujie.config.MyBean;
import com.liujie.entity.Stock;
import com.liujie.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: 刘杰.
 * Date: 2018-8-21.
 * Time: 10:20.
 * Explain:
 */
@Controller
public class SimpleController{

    @Value("${spring.application.name}")
    String appName;


    @Autowired
    private StockService stockService;

    @Autowired
    public MyBean myBean(ApplicationArguments args){
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        return null;
    }

    @GetMapping("/index")
    public String homePage(Model model, HttpServletRequest request) {

        System.out.println("param1:"+request.getParameter("param1"));
        List<Stock> list=stockService.queryStock();

        model.addAttribute("appName", appName+"1223423");
        model.addAttribute("listSize",String.valueOf(list.size()));

        return "home";
    }

}
