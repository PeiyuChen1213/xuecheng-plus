package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/14/2023 11:27 PM
 */
public interface CourseCategoryService {
    /**
     * 课程分类树形结构查询
     * @return
     */
    public List<CourseCategoryTreeDto> queryTreeNodes();
}
