/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.dao;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author ThinkPad
 */
public interface ElasticSearchDAO<T> extends ElasticsearchRepository<T, Integer> {

    /**
     * 根据帐号查找密码
     *
     * @param name 帐号
     * @return
     */
    List findPasswordByName(String name);

    /**
     * 根据名称查找分页数据。
     *
     * @param pageable
     * @return
     */
    Page findByName(Pageable pageable);
}
