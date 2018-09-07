package com.idegroup.idekriyaStore.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

/**
 * This class will be used two create two types of Spring @Beans:
 * 1. Session Factory
 * 2. Data Source
 * */

@Configuration
@PropertySource("app.properties")
public class DataConfig {

    @Autowired
    private Environment env;

    /*Build the SessionFactory @Bean"*/
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        Resource config = new ClassPathResource("hibernate.cfg.xml");

        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

        sessionFactory.setConfigLocation(config);/*<- set the location of the session factory config*/

        sessionFactory.setPackagesToScan(env.getProperty("idekriyaStore.entity.package"));

        /*we need to build the dataSource Bean method first!*/
        sessionFactory.setDataSource(dataSource());

        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();

        ds.setDriverClassName(env.getProperty("idekriyaStore.db.driver"));
        ds.setUrl(env.getProperty("idekriyaStore.db.url"));
        ds.setUsername(env.getProperty("idekriyaStore.db.username"));
        ds.setPassword(env.getProperty("idekriyaStore.db.password"));

        return ds;
    }
}
