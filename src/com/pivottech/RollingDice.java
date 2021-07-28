package com.pivottech;
import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;

public class RollingDice {

    public static void main(String[] args) {
	    // rolls 6 times
        System.out.println(roll(6));
    }

    private static int[] roll(int rollCount) {
        int[] rollArray = new int[rollCount];

        for (int i = 0; i < rollArray.length; i++) {
            Random r = new Random();
            rollArray[i] = r.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(rollArray));
        return rollArray; // replace this with your integer array
    }
}
