package com.spring.intro.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIntroApplication {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        // com.spring.intro.springintro.BubbleSortAlgorithm@3901d134

        System.out.println(result);

        SpringApplication.run(SpringIntroApplication.class, args);
    }

}
