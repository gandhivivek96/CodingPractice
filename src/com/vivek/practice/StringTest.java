package com.vivek.practice;

public class StringTest {

    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println("str1 (literal): " + str1 + ", HashCode: " + str1.hashCode());

      String str5 = "hello";
        System.out.println("str5 (literal): " + str5 + ", HashCode: " + str5.hashCode());
        // str1 and str 5 are pointing to same hashcode i.e. memory location in intern pool

        str1 = str1 + " world"; // "hello world" - A new string is created
        System.out.println("str1 (modified literal): " + str1 + ", HashCode: " + str1.hashCode());


        // String using new String()
        String str2 = new String("hello");
        System.out.println("str2 (new String): " + str2 + ", HashCode: " + str2.hashCode());

        str2 = str2 + " world"; // "hello world" -  A new string is created
        System.out.println("str2 (modified new String): " + str2 + ", HashCode: " + str2.hashCode());


        //Demonstrating string pool (for literals)
        String str3 = "hello"; // Same literal as original str1
        System.out.println("str3 (literal): " + str3 + ", HashCode: " + str3.hashCode()); //Same hashcode as the original str1

        String str4 = new String("hello"); //Same content as str3 but new object
        System.out.println("str4 (new String): " + str4 + ", HashCode: " + str4.hashCode()); //Different hashcode

    }
}
