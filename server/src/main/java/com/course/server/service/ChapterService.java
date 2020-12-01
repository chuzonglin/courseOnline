package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.dto.ChapterDto;
import com.course.server.mapper.ChapterMapper;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {
    @Resource
    private ChapterMapper chaptermapper;

    public List<ChapterDto> list(){
        PageHelper.startPage(2,1);
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chaptersList = chaptermapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtoList = new ArrayList<ChapterDto>();
        for (int  i= 0, l = chaptersList.size(); i< l;i++) {
            Chapter chapter = chaptersList.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }
}
