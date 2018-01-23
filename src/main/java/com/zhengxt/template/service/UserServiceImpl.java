/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.service;

import com.zhengxt.template.entity.Users;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ThinkPad
 */
@Service
public class UserServiceImpl implements UserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int findUserCount() {
        return 123;
    }

    @Override
    public Users findUserById(Long id) {
        return entityManager.find(Users.class, id);
    }

    @Override
    @Transactional
    public void saveUser(Users users) {
        entityManager.persist(users);
    }

}
