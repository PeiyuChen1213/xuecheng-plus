package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/14/2023 5:12 PM
 */
public interface CourseBaseInfoService {

    /**
     * 根据查询条件进行分页查询
     * @param pageParams // 查询的页码
     * @param queryCourseParamsDto // 查询条件
     * @return // 查询结果
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);


    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}
