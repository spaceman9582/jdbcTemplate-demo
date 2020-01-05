package com.example.jdbcTemplatedemo.service;

import java.util.List;
import java.util.Map;

public interface TestService {
    List<Map<String, Object>> getUserList() throws Exception;
}
