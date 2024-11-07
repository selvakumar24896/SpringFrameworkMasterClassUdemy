package com.udemy.spring_master_class.SpringMasterClass.S1_basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // New bean will be created whenever we instantiate the class
public class BinarySearch {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    SortAlgorithm sortAlgorithm;
//    public BinarySearch(SortAlgorithm algorithm){
//        super();
//        this.sortAlgorithm = algorithm;
//        System.out.println("!!!!Sort algorithm used is "+algorithm.getClass());
//    }
    public int searchElement(int[] arr, int element){
        System.out.println("!!!!Sort algorithm used is "+sortAlgorithm.getClass());
        sortAlgorithm.sortArray(arr);
        return 3;
    }

    @PostConstruct
    public void  postConstruct(){
        LOGGER.info("***In postConstruct");
    }

    @PreDestroy
    public void  preDestroy(){
        LOGGER.info("***In preDestroy");

    }
}
