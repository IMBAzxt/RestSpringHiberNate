/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author ThinkPad
 */
public interface ElasticSearchService<T> {

    /**
     * 保存
     *
     * @param t
     */
    void save(T t);

    /**
     * 删除
     *
     * @param t
     */
    void delete(T t);

    /**
     * 根据id查找数据
     *
     * @param id id
     * @return 
     */
    T findOne(Integer id);

    /**
     * 查找所有的数据
     *
     * @return 数据集
     */
    Iterable<T> findAll();

    /**
     * 分页显示所有数据
     *
     * @param pageable 分页对象
     * @return 分页数据
     */
    Page<T> findAll(Pageable pageable);

    
}
