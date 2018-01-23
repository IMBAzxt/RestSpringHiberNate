/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.exception;

/**
 *
 * @author ThinkPad
 */
public enum ExceptionInfo {

    OK(200, "访问成功"),
    FAIL(500, "内部错误"),
    ID_INVALID(1, "ID is invalid"),
    OTHER_ERR(2, "未知错误");

    private int code;
    private String message;

    ExceptionInfo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
