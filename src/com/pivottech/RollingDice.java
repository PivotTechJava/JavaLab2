package com.pivottech;

import java.util.ArrayList;
import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
	    // rolls 6 times
        System.out.println(roll(6));
    }

    private static int roll(int rollCount ) {
        // your code here
        //Array list is initialized and random is created
        ArrayList<Integer> rollResult = new ArrayList<Integer>(rollCount);
        Random rand = new Random();
        //Loop that generate random number with 10 being max and will add value to Array List
        for(int i = 0; i < rollCount;i++)
        {

            int x = rand.nextInt(6)+1;
            rollResult.add(x);


        }

        //System prints array list
        System.out.println(rollResult);
        return rollCount;
    }
}
