package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description 修改课程信息的模型类
 * @date 1/16/2023 2:42 PM
 */
@Data
@ApiModel(value="EditCourseDto", description="修改课程基本信息")
public class EditCourseDto extends AddCourseDto{
    @ApiModelProperty(value = "课程名称", required = true)
    private Long id;
}
