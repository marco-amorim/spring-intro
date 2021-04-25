package com.spring.intro.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {

    // Questions to wire beans together:

    // What are beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need cause everything is on the same package

    public static void main(String[] args) {
        // This is not needed anymore because we are using @Component and @Autowired
        // BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

        // Application Context
        ConfigurableApplicationContext context = SpringApplication.run(SpringIntroApplication.class, args);

        // Using application context to get specific bean
        BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println("The result is: " + result);

    }

}
