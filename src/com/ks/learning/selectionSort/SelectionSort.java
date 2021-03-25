package com.ks.learning.selectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {80, 12, -10, 1, 15, -20, 18, -55, 55, -1};
        int swapCount = 0;
        for (int unsortedPartition = intArray.length - 1; unsortedPartition > 0; unsortedPartition--) {
            int largest = 0;
            for (int i = 1; i <= unsortedPartition; i++) {
                if (intArray[largest] < intArray[i]) {
                    largest = i;
                }
            }
            swap(intArray, largest, unsortedPartition);
            swapCount++;
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println("Swap count : " + swapCount);
        System.out.println("Time complexity : (O)n square Quadratic");
    }

    public static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
