package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // New bean will be created whenever we instantiate the class
public class BinarySearch {

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
}
