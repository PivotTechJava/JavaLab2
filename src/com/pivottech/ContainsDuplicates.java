package com.pivottech;

public class ContainsDuplicates {


    public static void main(String[] args) {

        // change this array as coding to see if it works for a case where there are no duplicates
        int[] testArray = {1,2,3,3,4,5};

        // prints if contains duplicates
        System.out.println(containsDuplicates(testArray) ? "contains duplicates" : "contains NO duplicates");
    }

    private static boolean containsDuplicates(int[] arr) {
        boolean duplicateFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[i] == (arr[j])) {
                    duplicateFound = true;
                }
            }
        }
        return duplicateFound;
    }
}
