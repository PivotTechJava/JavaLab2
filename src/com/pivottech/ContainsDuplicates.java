package com.pivottech;

//import java.io.OptionalDataException;
//see if arr has duplicates
public class ContainsDuplicates {


    public static void main(String[] args) {

        // change this array as coding to see if it works for a case where there are no duplicates
        int[] testArray = {1,2,3,8,4,5};

        // prints if contains duplicates
        System.out.println(containsDuplicates(testArray) ? "contains duplicates" : "contains NO duplicates");
    }

    private static boolean containsDuplicates(int[] testArray) {
        // your code here
        Boolean x = false;

        for (int i = 0; i < testArray.length; i++){
           for (int j = i + 1; j < testArray.length; j++)
           {
               if (testArray[i] == testArray[j]){

                 //  System.out.println("Duplicates");
                   x = true;
               }
               //return true;
           }
        }
       return x; // replace this with right answer
    }
}

