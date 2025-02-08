package com.vivek.practice;

import java.util.HashSet;

public class FindDuplicates {
//. Find Duplicates in an Array
    public static void main(String[] args) {
        int arr[] = {10,30,50,160,10,120};
        HashSet<Integer> findDup = new HashSet<>();
        for (int num:arr)
            if (!findDup.add(num)) {
                System.out.println("Duplicate found -> " + num);
            }
    }
}
