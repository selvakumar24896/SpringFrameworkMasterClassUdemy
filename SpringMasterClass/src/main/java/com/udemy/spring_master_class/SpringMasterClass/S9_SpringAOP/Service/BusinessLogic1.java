package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Repository.Dao1;

@Service
public class BusinessLogic1 {

    @Autowired
    Dao1 dao1;

    public String doSomething(){
        return dao1.retreiveSomething();
    }
}
