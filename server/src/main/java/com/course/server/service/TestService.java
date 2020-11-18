package com.course.server.service;

import com.course.server.domin.Test;
import com.course.server.mapper.TestMapper;
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
