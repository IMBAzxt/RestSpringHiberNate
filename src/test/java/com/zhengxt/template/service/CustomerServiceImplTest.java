/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.service;

import com.zhengxt.template.entity.Customer;
import org.elasticsearch.client.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ThinkPad
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerServiceImplTest {

//    /**
//     * 注入service
//     */
//    @Autowired
//    private ElasticSearchService<Customer> elasticSearchService;

//    /**
//     * 注入客户端对象 基于原生API
//     */
//    @Autowired
//    private Client client;

//    /**
//     * 注入es服务器模板
//     */
//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 通过 ElasticsearchTemplate 创建索引和添加映射
     */
    @Test
    public void createIndex() {
        System.out.println("alsdkjf");
//        elasticsearchTemplate.createIndex(Customer.class);
//        elasticsearchTemplate.putMapping(Customer.class);
    }

//    /**
//     * 添加方法测试
//     */
//    @Test
//    public void testSave() {
//        Customer customer = new Customer();
//        customer.setId(1001);
//        customer.setName("test" + System.currentTimeMillis());
//        customer.setPassword("11111");
//        elasticSearchService.save(customer);
//    }
//
//    /**
//     * 根据索引删除的方法测试
//     */
//    @Test
//    public void testDelete() {
//        Customer customer = new Customer();
//        customer.setId(1001);
//        elasticSearchService.delete(customer);
//    }
//
//    /**
//     * 根据索引查询的方法测试
//     */
//    @Test
//    public void testFindOne() {
//        System.out.println(elasticSearchService.findOne(1001));
//    }
//
//    /**
//     * 添加100条测试数据的方法
//     */
//    @Test
//    public void testSaveBatch() {
//        for (int i = 1; i <= 100; i++) {
//            Customer customer = new Customer();
//            customer.setId(1001);
//            customer.setName("test" + System.currentTimeMillis());
//            customer.setPassword("11111");
//            elasticSearchService.save(customer);
//        }
//    }

//    /**
//     * 排序分页查询的方法测试
//     */
//    @Test
//    public void testSortAndPaging() {
//        Iterable<Customer> customers = elasticSearchService.findAll();
//        for (Customer customer : customers) {
//            System.out.println(customer);
//        }
//
//        Pageable pageable = new PageRequest(0, 10);
//        Page<Customer> pageData = elasticSearchService.findAll(pageable);
//        for (Customer customer : pageData.getContent()) {
//            System.out.println(customer);
//        }
//    }

}
