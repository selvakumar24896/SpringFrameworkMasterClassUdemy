package com.udemy.spring_master_class.SpringMasterClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMasterClassApplication {

//  What are the beans?    			- @Component
//	Dependencies of the bean?  		- @Autowired
//	Where to search for the bean	- applicationContext.getBean(<beanClass>)
	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(SpringMasterClassApplication.class, args);
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class); // if the Scope of BinarySearch is not defined explicitly it will be singleton i.e binarySearch1 is same as binarySearch
		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int bSearch = binarySearch.searchElement(new int[]{1,2,3,4,5}, 3);
		System.out.println(bSearch);
	}

}
