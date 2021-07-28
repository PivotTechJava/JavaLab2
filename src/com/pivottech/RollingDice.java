package com.pivottech;
import java.util.*;
import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
	    // rolls 6 times
        System.out.println(roll(6));
    }

    private static ArrayList<Integer> roll(int n) {
        // your code here

        // Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

        // method accepts integer n
        // need to loop 1 to n times
        //declare an array
        ArrayList <Integer> rollData = new ArrayList <Integer> ();
        //create loop that populates array
        int rollResult;
        for (int i = 1; i <= n; i++) {
            rollResult = new Random().nextInt(7 - 1) + 1;
            rollData.add(rollResult);
        }


        return rollData; // replace this with your integer array
    }
}
