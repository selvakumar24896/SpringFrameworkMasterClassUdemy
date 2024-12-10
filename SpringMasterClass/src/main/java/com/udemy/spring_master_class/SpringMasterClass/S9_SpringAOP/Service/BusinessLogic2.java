package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Repository.Dao1;
import com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Repository.Dao2;

@Service
public class BusinessLogic2 {
    @Autowired
    Dao2 dao2;

    public String doSomething(){
        return dao2.retreiveSomething();
    }
}
