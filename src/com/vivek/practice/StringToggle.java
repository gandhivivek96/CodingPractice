package com.vivek.practice;

public class StringToggle {

    public static void main(String[] args) {
        String s="Hello World";
        char[] input = s.toCharArray();
       StringBuilder result = new StringBuilder();
        for(char c:input)
        {
            if (Character.isLowerCase(c))
                result.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else
                result.append(c);
        }
        System.out.println(s);
        System.out.println("-- string after toggle---");
        System.out.println(result);
    }
}
