package com.course.service;

import com.course.domin.Test;
import com.course.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testmapper;

    public List<Test> list(){
        return testmapper.list();
    }
}
