package com.vivek.practice;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        anagramCheck(str1,str2);
    }
    public static void anagramCheck(String str1,String str2)
    {
        //converting string into char array
        char[] test1 = str1.toCharArray();
        char[] test2 = str2.toCharArray();

        //sorting arrays
        Arrays.sort(test1);
        Arrays.sort(test2);

        //check both array
        if (Arrays.equals(test1,test2))
            System.out.println("it is Anagram");
        else
            System.out.println("it is not Anagram");

    }
}
