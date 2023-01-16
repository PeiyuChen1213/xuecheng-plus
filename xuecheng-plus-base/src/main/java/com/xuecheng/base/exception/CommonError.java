package com.xuecheng.base.exception;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description
 * @date 1/16/2023 10:25 AM
 */
public enum CommonError {

    //枚举类里面的变量都是这个枚举类的实例对象 所以以下是创建了这些对象 并且使用了这个枚举类的有参构造器
    UNKNOWN_ERROR("执行过程异常，请重试。"),
    PARAMS_ERROR("非法参数"),
    OBJECT_NULL("对象为空"),
    QUERY_NULL("查询结果为空"),
    REQUEST_NULL("请求参数为空");

    private String errMessage;

    public String getErrMessage() {
        return errMessage;
    }

    private CommonError( String errMessage) {
        this.errMessage = errMessage;
    }
}
