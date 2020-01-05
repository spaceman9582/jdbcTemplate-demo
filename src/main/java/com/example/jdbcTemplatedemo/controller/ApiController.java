/*
 * Copyright (c) 2020 zhu ge.Jin
 * @Date: 1/5/20, 11:53 AM
 * @Author: zhuge.Jin
 */

package com.example.jdbcTemplatedemo.controller;

import com.example.jdbcTemplatedemo.model.TestModel;
import com.example.jdbcTemplatedemo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {
    @Autowired
    TestServiceImpl testService;


    @RequestMapping("/getUser")
    public List<Map<String, Object>> getUser(){
        List<Map<String, Object>> user_list = new ArrayList<>();

        try {
            user_list = testService.getUserList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user_list;
    }
}
