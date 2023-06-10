package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    SortAlgorithm bubbleSortAlgorithm;
    public BinarySearch(SortAlgorithm algorithm){
        super();
        this.bubbleSortAlgorithm = algorithm;
        System.out.println("!!!!Sort algorithm used is "+algorithm.getClass());
    }
    public int searchElement(int[] arr, int element){
        bubbleSortAlgorithm.sortArray(arr);
        return 3;
    }
}
