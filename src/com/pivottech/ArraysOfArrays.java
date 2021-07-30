package com.pivottech;

import java.util.Arrays;

public class ArraysOfArrays {
    public static void main(String[] args) {
        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(returnLowestAvgArr(weeklyMonthTemperatures)));
    }

    public static int[] returnLowestAvgArr(int[][] masterArr) {
        double[] holdingArr = new double[masterArr.length];
        for (int i = 0; i < masterArr.length; i++) {
            int [] currentArr = masterArr[i];
            double avg = CalculatingAverages.getTheAverage(currentArr);
            holdingArr[i] = avg;
        }
        double minAvg = 0;
        int minArray = -1;
        for (int j = 0; j < holdingArr.length; j++) {
            if (holdingArr[j] < minAvg || minAvg == 0) {
                minAvg = holdingArr[j];
                minArray = j;
            }
        }
        return masterArr[minArray];
    }

}
