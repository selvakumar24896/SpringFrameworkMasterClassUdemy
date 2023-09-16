package com.udemy.spring_master_class.ComponentScan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
// This make the class to create new instances at each object creation even though the autowired class(PersonDao) is singleton
public class ComponentJdbcConnection {

    public void ComponentJdbcConnection(){

        System.out.println("JDBC Connection");
    }

}
