package com.ks.learning.quickSort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {80, 12, -10, 1, 15, -20, 18, -55, 55, -1};

        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));

        System.out.println("Time complexity : (O)n square Quadratic");
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            //Note : Empty loop body for dec j
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            //Note : Empty loop body for dec i
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
