package com.vivek.practice;

import java.util.Arrays;
import java.util.Scanner;

public class findMissingNumber
{

    /*
    Find the Missing Number
You are given an array of n-1 integers, and these integers are in the range of 1 to n. There are no duplicates in the array. One of the integers is missing in the array. Write a function that finds and returns the missing number.

Ada AI
CodingDrills logo
Examples:


Input: 3 7 1 6 5 2
Output: 4
Explanation: In the given range 1 to 7, the number 4 is missing.


Input: 1 2 3 4 6
Output: 5
Explanation: In the given range 1 to 6, the number 5 is missing.


Input: 1 3
Output: 2
Explanation: In the given range 1 to 3, the number 2 is missing.

CodingDrills logo
Notes:


The array will always have at least one element and will not contain duplicates.
     */

    private static void process(String[] numbers) {


    }

//        System.out.println(Arrays.toString(numbers));


    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
//       process(numbers);
        int[] num = new int[numbers.length];
        int i = 0;
        for (String c : numbers) {
            num[i] = Integer.parseInt(c);
            i++;
        }
        Arrays.sort(num);

        int n = num.length + 1; // Correct: n is the *expected* size (length + 1)
        int expectedSum = n * (n + 1) / 2; // Calculate sum from 1 to n

        int actualSum = 0;
        for (int numc : num) {
            actualSum += numc;
        }

        System.out.println(expectedSum - actualSum);
   /*
   The function you wrote is quite good:



It transforms the string array into an integer array and sorts it.

It calculates the total sum (expectedSum) of numbers from 1 to the maximum number found in the array which should be the actual length of the array (including the missing number).

It also calculates the sum of all numbers present in the array (actualSum).

It then finds the missing number by subtracting the actualSum from expectedSum.

    */


    }
}
