/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ThinkPad
 */
@Provider
public class ExceptionResolver implements ExceptionMapper<Exception> {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ExceptionResolver.class);

    @Override
    public Response toResponse(Exception e) {
        Response.ResponseBuilder ResponseBuilder = null;
//        e.printStackTrace();
        if (e instanceof ConstraintViolationException) {
            ExceptionEntity entity = new ExceptionEntity(ExceptionInfo.FAIL.getCode(), ExceptionInfo.FAIL.getMessage());
            ResponseBuilder = Response.ok(entity, MediaType.APPLICATION_JSON);
        } else {
            ExceptionEntity entity = new ExceptionEntity(ExceptionInfo.OTHER_ERR.getCode(), e.getMessage());
            ResponseBuilder = Response.ok(entity, MediaType.APPLICATION_JSON);
        }
        return ResponseBuilder.build();
    }
}
