package com.pivottech;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculatingAverages {
    public static void main(String[] args) {
        int numberArr[] = {4, 4, 4 ,4};
        // prints if contains duplicates
        System.out.println(getTheAverage(numberArr));

    }

    public static double getTheAverage(int[] arr) {
        return (double) Arrays.stream(arr).sum()/arr.length;
    };
}
