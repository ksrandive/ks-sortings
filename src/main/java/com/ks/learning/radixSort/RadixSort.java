package com.ks.learning.radixSort;

import java.util.Arrays;

public class RadixSort {

    public int[] runRadixSort() {
        int[] intArray = {4321, 4423, 2845, 8976, 5647, 6678};
        radixSort(intArray, 10, 4);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Time complexity : (O)nlog n Logarithmic");
        return intArray;
    }

    public void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }

    }

    public void radixSingleSort(int[] input, int position, int radix) {
        int numItem = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        //Adjust the countArray
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] tempArray = new int[numItem];
        for (int tempIndex = numItem - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItem; tempIndex++) {
            input[tempIndex] = tempArray[tempIndex];
        }
    }

    public int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}
