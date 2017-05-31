/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.templet.resource;

import com.zhengxt.templet.service.UserService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ThinkPad
 */
@Path("user")
public class UserRest {

    @Autowired
    UserService userService;

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public int count() {
        return userService.findUserCount();
    }
}
