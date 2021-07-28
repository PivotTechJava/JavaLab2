package com.pivottech;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RollingDice {

    public static void main(String[] args) {
	    // rolls 6 times
        System.out.println(roll(10));
    }

    private static String roll(int rollCount) {
        // declare array that has the length of the rollCount
        int[] rollData = new int[rollCount];

        // iterate through the amount of rolls and assign a random number between 1 and 6 for each index
        for (int i = 1; i < rollCount; i++) {
            rollData[i] = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        }

        // return the value as a string so it can be printed to the console
        return Arrays.toString(rollData);
    }
}
