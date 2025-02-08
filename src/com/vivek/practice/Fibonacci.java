package com.vivek.practice;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        fib(n);
    }

    private static void fib(int n) {
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            temp = a + b;
            a = b;
            b = temp;

            }




    }
}
