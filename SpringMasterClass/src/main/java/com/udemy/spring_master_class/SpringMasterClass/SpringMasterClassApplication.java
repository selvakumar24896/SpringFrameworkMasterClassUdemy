package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMasterClassApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(SpringMasterClassApplication.class, args);
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		int bSearch = binarySearch.searchElement(new int[]{1,2,3,4,5}, 3);
		System.out.println(bSearch);
	}

}
