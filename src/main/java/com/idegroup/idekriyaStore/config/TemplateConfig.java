package com.idegroup.idekriyaStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * This class is to configure the Thymeleaf engine
 * */

@Configuration
public class TemplateConfig {

    /*set the template resolver bean*/

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        final SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setCacheable(false);

        /*set where the template for thymeleaf engine must be located*/
        templateResolver.setPrefix("classpath:/templates/");

        /*set the prefix thus we do not have to repeat it:*/
        templateResolver.setSuffix(".html");

        return templateResolver;
    }

    /*set the template engine:*/

    @Bean
    public SpringTemplateEngine templateEngine() {
        final SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.addTemplateResolver(templateResolver());

        return springTemplateEngine;
    }

    /*set the Thymeleaf view resolver:*/

    @Bean
    public ThymeleafViewResolver viewResolver() {
        final ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine(templateEngine());
        thymeleafViewResolver.setOrder(1);

        return thymeleafViewResolver;
    }
}
