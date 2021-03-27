package com.ks.learning.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {80, 12, -10, 1, 15, -20, 18, -55, 55, -1};
//        int swapCount = 0;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;

        }

        System.out.println(Arrays.toString(intArray));
//        System.out.println("Swap count : " + swapCount);
        System.out.println("Time complexity : (O)n square Quadratic");
    }
}
