package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Service.BusinessLogic1;
import com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Service.BusinessLogic2;

@SpringBootApplication
public class SpringAOP implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BusinessLogic1 businessLogic1;

    @Autowired
    BusinessLogic2 businessLogic2;

    public static void main(String[] args) {
        SpringApplication.run(SpringAOP.class);
    }

    @Override
    public void run(String[] args) throws Exception{

        logger.info(businessLogic1.doSomething());
        logger.info(businessLogic2.doSomething());

    }
}
