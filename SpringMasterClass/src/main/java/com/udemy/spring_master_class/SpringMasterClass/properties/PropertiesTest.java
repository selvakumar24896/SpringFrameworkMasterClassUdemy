package com.udemy.spring_master_class.SpringMasterClass.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesTest {

    @Value("${Spring.udemy.myprop}")
    private String prop;
    public  String getProp(){
        return prop;
    }
}
