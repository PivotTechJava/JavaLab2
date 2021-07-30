package com.pivottech;

//average of elements in multi-dimensional array
public class ArrayOfArrays {

    public static void main(String[] args) {
        int[][] arr = {
                {66,64,58,65,71,57,60},
                {57,65,65,70,72,65,51},
                {55,54,60,53,59,57,61},
                {65,56,55,52,55,62,57},
        };

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
