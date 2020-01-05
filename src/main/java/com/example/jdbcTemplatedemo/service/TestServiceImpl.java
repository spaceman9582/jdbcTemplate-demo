/*
 * Copyright (c) 2020 zhu ge.Jin
 * @Date: 1/5/20, 11:52 AM
 * @Author: zhuge.Jin
 */

package com.example.jdbcTemplatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class TestServiceImpl implements TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> getUserList() throws Exception {
        List<Map<String, Object>> res_data = new ArrayList<>();
        String query = "select * from Users";

        res_data = jdbcTemplate.queryForList(query);
        return res_data;
    }
}
