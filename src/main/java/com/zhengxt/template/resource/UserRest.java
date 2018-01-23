/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.resource;

import com.zhengxt.template.entity.Users;
import com.zhengxt.template.service.UserService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ThinkPad
 */
@Path("user")
public class UserRest {

    @Autowired
    UserService userService;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserRest.class);

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public int count() {
        logger.info("系统时间:" + System.currentTimeMillis());
        return userService.findUserCount();
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Users findUsersById(@PathParam("id") Long id) {
        return userService.findUserById(id);
    }

    @GET
    @Path("save")
    @Produces({"application/xml", "application/json"})
    public Users findSave() {
        Users user = new Users();
        user.setUsername("测试1");
        user.setPassword("12345");
        user.setPasswordSalt("12345");
        userService.saveUser(user);
        return user;
    }
}
