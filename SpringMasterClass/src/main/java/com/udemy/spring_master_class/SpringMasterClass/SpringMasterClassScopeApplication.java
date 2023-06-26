package com.udemy.spring_master_class.SpringMasterClass;

import com.udemy.spring_master_class.SpringMasterClass.Scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMasterClassScopeApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringMasterClassScopeApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringMasterClassScopeApplication.class, args);
        PersonDao personDao = applicationContext.getBean(PersonDao.class);
        PersonDao personDao1 = applicationContext.getBean(PersonDao.class);

        LOGGER.info(personDao.toString());
        LOGGER.info(personDao.getJdbcConnection().toString());
        LOGGER.info(personDao1.toString());
        LOGGER.info(personDao1.getJdbcConnection().toString());
    }
}
