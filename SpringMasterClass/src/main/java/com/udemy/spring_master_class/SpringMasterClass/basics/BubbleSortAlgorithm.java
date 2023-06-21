package com.udemy.spring_master_class.SpringMasterClass.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sortArray(int[] arr){
        int[] sortedArray = new int[arr.length];
        return sortedArray;
    }
}
