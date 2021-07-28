package com.pivottech;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {


    public static void main(String[] args) {

        // change this array as coding to see if it works for a case where there are no duplicates
        int[] testArray = {1,2,3,3,4,5};

        // prints if contains duplicates
        System.out.println(containsDuplicates(testArray) ? "contains duplicates" : "contains NO duplicates");
    }

    private static boolean containsDuplicates(int[] arr) {
        Set<Integer> lump = new HashSet<Integer>();
        for (int i : arr) {
            if (lump.contains(i)) return true;
            lump.add(i);
        }
        return false;
    }
}
