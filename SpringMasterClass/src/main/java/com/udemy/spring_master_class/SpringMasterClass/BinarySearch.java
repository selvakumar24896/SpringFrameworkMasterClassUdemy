package com.udemy.spring_master_class.SpringMasterClass;

public class BinarySearch {

    SortAlgorithm sortAlgorithm;
    public BinarySearch(SortAlgorithm algorithm){
        this.sortAlgorithm = algorithm;
    }
    public int searchElement(int[] arr, int element){
        sortAlgorithm.sortArray(arr);
        return 0;
    }
}
