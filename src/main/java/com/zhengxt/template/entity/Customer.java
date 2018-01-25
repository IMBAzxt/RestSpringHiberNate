/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxt.template.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 *
 * @author ThinkPad
 */
//elasticsearch,@Document 文档对象 （索引信息、文档类型 ）
@Document(indexName = "test", type = "doc")
public class Customer {

    /**
     * ID
     */
    @Id
    @Field(index = FieldIndex.not_analyzed, store = true, type = FieldType.Integer)
    private Integer id;

    //@Field 每个文档的字段配置（类型、是否分词、是否存储、分词器 ）
    @Field(index = FieldIndex.analyzed, analyzer = "ik", store = true, searchAnalyzer = "ik", type = FieldType.String)
    public String name;

    @Field(index = FieldIndex.analyzed, analyzer = "ik", store = true, searchAnalyzer = "ik", type = FieldType.String)
    public String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", password=" + password + '}';
    }

}
