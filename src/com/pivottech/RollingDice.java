package com.pivottech;

public class RollingDice {

    public static void main(String[] args) {
	    // rolls 6 times
        System.out.println(roll(6));
    }

    private static int[] roll(int n) {
        // your code here

        // Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

        // method accepts integer n
        // need to loop 1 to n times
        //declare an array
        ArrayList <int> rollData = new ArrayList <int> ();
        //create loop that populates array
        int rollResult;
        for (int i = 1; i <= n; i++) {
            rollResult = random.nextInt(6 - 1) + 1;
            rollData.add(rollResult);
        }


        return rollData; // replace this with your integer array
    }
}
