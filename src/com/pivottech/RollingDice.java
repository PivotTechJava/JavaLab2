package com.pivottech;
import java.util.ArrayList;
import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        // write your code here
        //System Calls method "roll" with the number rolls given
        roll(5);
    }
    public static int roll( int n)
    {
        //Array list is initialized and random is created
        ArrayList <Integer> rollResult = new ArrayList<Integer>(n);
        Random rand = new Random();

        //Loop that generate random number with 10 being max and will add value to Array List
        for(int i = 0; i < n;i++)
        {

            int x = rand.nextInt(6)+1;
            rollResult.add(x);


        }

        //System prints array list
        System.out.println(rollResult);
        return n;
    }
}
