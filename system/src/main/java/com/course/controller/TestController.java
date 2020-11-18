package com.course.controller;

import com.course.domin.Test;
import com.course.mapper.TestMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestMapper testMapper;

    @RequestMapping("/test")
    public List<Test> test(){
        return testMapper.list();
    }
}
