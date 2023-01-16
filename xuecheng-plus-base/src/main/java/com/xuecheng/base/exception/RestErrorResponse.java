package com.xuecheng.base.exception;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description 错误响应包装
 * @date 1/16/2023 10:41 AM
 */
public class RestErrorResponse {
    private String errMessage;

    public RestErrorResponse(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
