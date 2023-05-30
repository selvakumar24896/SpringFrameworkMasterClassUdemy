package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    SortAlgorithm sortAlgorithm;
    public BinarySearch(SortAlgorithm algorithm){
        super();
        this.sortAlgorithm = algorithm;
    }
    public int searchElement(int[] arr, int element){
        sortAlgorithm.sortArray(arr);
        return 3;
    }
}
