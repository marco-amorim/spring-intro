package com.spring.intro.springintro;

public class BinarySearchImpl {
    // Dummy algorithm, not really implementing any logic to search!

    public int binarySearch(int[] numbers, int numberToSearch) {

        /*
        * BinarySearch is tight coupled to the sorting algorithms below, that's bad!
        * */

        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

        // Using external class to handle specific sorting, it's better but still pretty bad!
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

        // Implementing Sorting Logic
        // BubbleSort Algorithm
        // QuickSort Algorithm

        // Return the result

        return 3;
    }


}
