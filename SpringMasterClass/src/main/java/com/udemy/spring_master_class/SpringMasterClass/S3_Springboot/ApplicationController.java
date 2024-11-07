package com.udemy.spring_master_class.SpringMasterClass.S3_Springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApplicationController {

    @RequestMapping("/course")
    public List<Course> getAllCourse(){
        return Arrays.asList(new Course(1,"selva", "02/04/2022"),
                new Course(2,"kumar", "21/08/2023"));
    }
}
