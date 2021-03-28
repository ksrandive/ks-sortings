package com.ks.learning.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort() {
        int[] intArray = {80, 12, -10, 1, 15, -20, 18, -55, 55, -1};
        int swapCount = 0;
        for (int unsortedPartition = intArray.length - 1; unsortedPartition > 0; unsortedPartition--) {

            for (int i = 0; i < unsortedPartition; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                    swapCount++;
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println("Swap count : " + swapCount);
        System.out.println("Time complexity : (O)n square Quadratic");
        return intArray;
    }

    public void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
