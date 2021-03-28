package com.ks.learning.countSort;

import java.util.Arrays;

public class CountSort {

    public int[] runCountSort() {
        int[] intArray = {8, 2, 10, 1, 5, 2, 8, 5, 5, 1};
        countSort(intArray, 1, intArray.length);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Time complexity : (O)1 constant");
        return intArray;
    }

    public void countSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
