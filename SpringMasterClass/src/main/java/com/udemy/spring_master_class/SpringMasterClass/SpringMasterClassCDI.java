package com.udemy.spring_master_class.SpringMasterClass;

import com.udemy.spring_master_class.SpringMasterClass.CDI.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringMasterClassCDI {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringMasterClassCDI.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringMasterClassCDI.class, args);
        CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);

        LOGGER.info("{} / {}",cdiBusiness,cdiBusiness.getCdiTestClass());

    }
}
