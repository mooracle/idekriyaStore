package com.idegroup.idekriyaStore.config;

import org.hashids.Hashids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * This class is used to configure the app running
 * using the property defined in the app.properties it will define the hashids @Bean to be used whenever is needed
 * */

@Configuration
@PropertySource("app.properties")
public class AppConfig {

    @Autowired
    private Environment env;

    /*Make the @Bean for Hash Id*/

    @Bean
    public Hashids hashids() {

        return new Hashids(env.getProperty("idekriyaStore.hash.salt"));

    }
}
