package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMasterClassApplication {

	public static void main(String[] args) {
		searchInArray(new int[]{1,2,3,4,5}, 3);
		SpringApplication.run(SpringMasterClassApplication.class, args);
	}

	private static void searchInArray(int[] arr, int i) {
		BinarySearch bSearch = new BinarySearch(new BubbleSort());
		bSearch.searchElement(arr, i);
	}

}
