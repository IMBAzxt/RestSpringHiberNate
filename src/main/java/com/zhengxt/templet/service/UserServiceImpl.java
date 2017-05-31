/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.templet.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author ThinkPad
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public int findUserCount() {
        return 123;
    }

}
