package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    public String retreiveSomething() {
        return "something in DAO1";
    }
}
