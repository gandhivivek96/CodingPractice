package com.vivek.practice;

public class FindMax {
    public static void main(String[] args) {
        int arr[] = {40,10,20,190,120,5 };
        int max = Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>max)
                max=num;
        }
        if(max!=Integer.MIN_VALUE)
            System.out.println("Largest number : "+max);
    }

}
