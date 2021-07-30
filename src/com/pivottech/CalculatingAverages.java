package com.pivottech;
import java.util.*;
public class CalculatingAverages {
    public static void main(String[] args) {
        int [] a = {8,4,4,2,5};
        calcAvg(a);
    }
    public static float calcAvg(int [] aver)
    {
        int num = aver.length;
        float average = 0;
        float sum = 0;
        for(int i = 0; i < num; i++ )
        {
            sum += aver[i];
            average = sum / num;
        }
        System.out.println("  "+ average);
        return average;
    }

}
