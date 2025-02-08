package com.vivek.practice;

public class ReverseString {
    public static void main(String[] args) {
        stringReverse("Hello world");
    }

    public static void stringReverse(String test){

        String reverseStr = new StringBuilder(test).reverse().toString();
        System.out.println(reverseStr);
    }
}
