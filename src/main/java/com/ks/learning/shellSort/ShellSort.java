package com.ks.learning.shellSort;

import java.util.Arrays;

public class ShellSort {

    public int[] shellSort(String[] args) {
        int[] intArray = {80, 12, -10, 1, 15, -20, 18, -55, 55, -1};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println("Time complexity : (O)n square Quadratic");
        return intArray;
    }
}
