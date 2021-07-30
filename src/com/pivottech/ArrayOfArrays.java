package com.pivottech;

//average of elements in multi-dimensional array
public class ArrayOfArrays {

    public static void main(String[] args) {
        int[][] arr = {{8,4,6,1,5},{4,4,3,2,1},{2,4,7,4,3},{3,5,6,8,5},{4,6,7,9,4}};

        getAverage(arr);
    }

    public static float getAverage(int[][] arr){
        float sum = 0;
        float counter = 0;
        float avg = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
                counter++;
                avg = sum / counter;

            }
        }
        System.out.println("The average is " + avg);
        return avg;

    }


}
