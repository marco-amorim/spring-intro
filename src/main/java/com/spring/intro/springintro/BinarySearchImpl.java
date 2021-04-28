package com.spring.intro.springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    // Dummy algorithm, not really implementing any logic to search!

    // For dependency injection we can use either Setter, a normal Constructor or none of them
    // there's not much difference with the newest versions of spring, so the most used approach
    // is as shown below, simply using @Autowired is enough
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearch) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Search the array

        return 3;
    }


}
