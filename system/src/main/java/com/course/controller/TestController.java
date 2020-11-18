package com.course.controller;

import com.course.server.domain.Test;
import com.course.server.mapper.TestMapper;
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
        return (List<Test>) testMapper.selectByExample(null);
    }
}
