/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.templet.service;

import com.zhengxt.templet.dao.Users;

/**
 *
 * @author ThinkPad
 */
public interface UserService {

    public int findUserCount();

    public Users findUserById(Long id);

    public void saveUser(Users users);
}
