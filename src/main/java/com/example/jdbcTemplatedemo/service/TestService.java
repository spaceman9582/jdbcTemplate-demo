/*
 * Copyright (c) 2020 zhu ge.Jin
 * @Date: 1/5/20, 11:52 AM
 * @Author: zhuge.Jin
 */

package com.example.jdbcTemplatedemo.service;

import java.util.List;
import java.util.Map;

public interface TestService {
    List<Map<String, Object>> getUserList() throws Exception;
}
