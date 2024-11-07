package com.udemy.spring_master_class.SpringMasterClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.udemy.spring_master_class.SpringMasterClass.properties.ConfigurationPropertiesTest;

@SpringBootApplication
public class SpringMasterClassConfigurationProperties {

    static Logger LOGGER = LoggerFactory.getLogger(SpringMasterclassProperties.class);
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringMasterClassConfigurationProperties.class);
        ConfigurationPropertiesTest configProp = context.getBean(ConfigurationPropertiesTest.class);
        LOGGER.info(configProp.getUser()+"<-->"+configProp.getCity());
    }
}
