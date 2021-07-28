package com.pivottech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {


    public static void main(String[] args) {

        // change this array as coding to see if it works for a case where there are no duplicates
        int[] testArray = {1,2,3,3,4,5};

        // prints if contains duplicates
        System.out.println(containsDuplicatesArr(testArray) ? "contains duplicates" : "contains NO duplicates");
    }

    // uses Set
    private static boolean containsDuplicatesSet(int[] arr) {
        Set<Integer> lump = new HashSet<Integer>();
        for (int i : arr) {
            if (lump.contains(i)) return true;
             lump.add(i);
        }
        return false;
    }

    // uses ArrayList
    private static boolean containsDuplicatesArr(int[] arr) {
        ArrayList<Integer> lump = new ArrayList<Integer>();
        for (int i : arr) {
            if (lump.contains(i)) return true;
            lump.add(i);
        }
        return false;
    }
}
