package com.course.business.controller.admin;

import com.course.server.domain.Chapter;
import com.course.server.mapper.ChapterMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    @Resource
    private ChapterMapper chapterMapper;

    @RequestMapping("/list")
    public List<Chapter> chapter(){
        return (List<Chapter>) chapterMapper.selectByExample(null);
    }
}
