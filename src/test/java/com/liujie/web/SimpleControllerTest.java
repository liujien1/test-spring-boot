package com.liujie.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author jie
 * @date 2019-3-25
 */
@RunWith(SpringRunner.class)
@AutoConfigureRestDocs
@WebMvcTest(TestController.class)
@ComponentScan("com.liujie")
@MapperScan("com.liujie.dao")
//@EnableAutoConfiguration
public class SimpleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test1() throws Exception {
        this.mockMvc.perform(get("/index").param("param1","sdssss")
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andDo(document("test-index"));
    }


}