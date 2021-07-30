package com.pivottech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;


public class ContainsDuplicates {


    public static void main(String[] args) {

        // change this array as coding to see if it works for a case where there are no duplicates
        Integer[] testArray = {1,2,3,3,4,5};

        // prints if contains duplicates
        System.out.println(containsDuplicates(testArray) ? "contains duplicates" : "contains NO duplicates");
    }

    private static boolean containsDuplicates(Integer[] arr) {
        HashMap<Integer,Integer> map = new HashMap();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));

        for (Integer i : arrayList) {
            Integer count = map.get(i);
            map.put(i, (count != null ? count + 1 : 0));
        }

        AtomicBoolean hasDupes = new AtomicBoolean(false);
        map.forEach((key, val) -> {
            if(val > 1) hasDupes.set(true);
        });

        System.out.println(arrayList);
        System.out.println(hasDupes);

        return hasDupes.getPlain();
    }
}
