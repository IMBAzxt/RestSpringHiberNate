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
public class ExceptionEntity {

    private int resp_code;
    private String resp_msg;

    public ExceptionEntity(int resp_code, String resp_msg) {
        this.resp_code = resp_code;
        this.resp_msg = resp_msg;
    }

    public ExceptionEntity() {
    }

    public int getResp_code() {
        return resp_code;
    }

    public void setResp_code(int resp_code) {
        this.resp_code = resp_code;
    }

    public String getResp_msg() {
        return resp_msg;
    }

    public void setResp_msg(String resp_msg) {
        this.resp_msg = resp_msg;
    }
}
