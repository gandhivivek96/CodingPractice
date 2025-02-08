package com.vivek.practice;

public class PalindromeCheck {
    public static void main(String[] args) {
        String test = "SIS";
        System.out.println("Palindrome for String - "+ test +" = "+palindromeCheck(test));
    }
    public static boolean palindromeCheck(String str)
    {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
