package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Repository;

import org.springframework.stereotype.Repository;

import com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect.TrackTime;

@Repository
public class Dao1 {

    @TrackTime
    public String retreiveSomething() {
        return "something in DAO1";
    }

    public String postSomething() {
        return "Posted";
    }
}
