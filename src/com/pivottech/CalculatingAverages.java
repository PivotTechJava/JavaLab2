package com.pivottech;

//Write a method that accepts an array of integers and
// calculates and returns the average of all the values in the array.

public class CalculatingAverages {

    public static void main(String[] args) {
        int[] arr = {8,4,6,1,5};
        getAverage(arr);
    }

    public static float getAverage(int[] arr){
        float sum = 0;
        float avg = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            avg = sum / arr.length;
        }
        System.out.println("The average is " + avg);
        return avg;

    }

}
