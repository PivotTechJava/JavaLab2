package com.pivottech;
import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculatingAverages {

    public static void main(String[] args) {
        int[] intArray = {13, 62, 5, 34};
        System.out.println(getAverage(intArray));
    }

    public static double getAverage(int[] arr) {
        return (double) Arrays.stream(arr).sum()/arr.length;
    }
}
