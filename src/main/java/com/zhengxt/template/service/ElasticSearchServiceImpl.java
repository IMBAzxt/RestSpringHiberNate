/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.service;

import com.zhengxt.template.dao.ElasticSearchDAO;
import com.zhengxt.template.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 *
 * @author ThinkPad
 */
public class ElasticSearchServiceImpl implements ElasticSearchService<Customer> {

    @Autowired
    private ElasticSearchDAO<Customer> elasticSearchDAO;

    @Override
    public void save(Customer t) {
        elasticSearchDAO.save(t);
    }

    @Override
    public void delete(Customer t) {
        elasticSearchDAO.delete(t);
    }

    @Override
    public Customer findOne(Integer id) {
        return elasticSearchDAO.findOne(id);
    }

    @Override
    public Iterable<Customer> findAll() {
        return elasticSearchDAO.findAll(new Sort(new Sort.Order(Sort.Direction.ASC, "id")));
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return elasticSearchDAO.findAll(pageable);
    }

}
