package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
