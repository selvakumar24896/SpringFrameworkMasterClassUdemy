package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm{

    @Override
    public int[] sortArray(int[] array) {
        return new int[0];
    }
}
