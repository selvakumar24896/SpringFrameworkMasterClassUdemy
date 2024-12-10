package com.udemy.spring_master_class.SpringMasterClass.S8_SpringBootIn10Steps;

import com.udemy.spring_master_class.SpringMasterClass.properties.PropertiesTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringMasterclassProperties {

    static Logger LOGGER = LoggerFactory.getLogger(SpringMasterclassProperties.class);
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringMasterclassProperties.class);
        PropertiesTest propertiesTest = context.getBean(PropertiesTest.class);
        LOGGER.info(propertiesTest.getProp());
    }
}
