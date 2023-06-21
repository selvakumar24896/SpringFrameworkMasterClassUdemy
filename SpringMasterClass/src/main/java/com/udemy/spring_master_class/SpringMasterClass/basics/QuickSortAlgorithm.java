package com.udemy.spring_master_class.SpringMasterClass.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sortArray(int[] array) {
        return new int[0];
    }
}
