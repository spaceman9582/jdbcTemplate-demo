/*
 * Copyright (c) 2020 zhu ge.Jin
 * @Date: 1/5/20, 11:53 AM
 * @Author: zhuge.Jin
 */

package com.example.jdbcTemplatedemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class JdbcTemplateConfig {

    @Autowired
    private Environment environment;


    @Bean
    public DataSource datasource() throws PropertyVetoException {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(environment.getProperty("spring.datasource.url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.username"));
        dataSource.setPassword(environment.getProperty("spring.datasource.password"));
        return dataSource;
    }

    @Bean
    JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        return new JdbcTemplate(datasource());
    }
}
