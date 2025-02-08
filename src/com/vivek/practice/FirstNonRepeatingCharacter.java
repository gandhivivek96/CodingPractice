package com.vivek.practice;

import java.util.LinkedHashMap;
import java.util.Map;
//Problem Statement
//Find the first non-repeating character in a string.
//Given a string, return the first character that does not repeat.
//If all characters repeat, return '_'.
//Example:
//Input: "aabbccde" → Output: 'd'
//Input: "aabbcc" → Output: '_'
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "aaacccnnnnrsssrn";
        System.out.print(firstUniqueChar(str));
    }
    private static char firstUniqueChar(String str)
    {
//        LinkedHashMap retains insertion order
        LinkedHashMap<Character,Integer> charCount = new LinkedHashMap<>();
        char[] c = str.toCharArray();
        for (char ch:c)
        {
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }

        for( Map.Entry<Character,Integer> m : charCount.entrySet())
        {
            if (m.getValue()==1)
                return m.getKey();
        }
        return '_';
    }
}
