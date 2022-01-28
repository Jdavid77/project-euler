package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(findLargestPalindromeMadeFromProductOfNumber(3));
        //System.out.println(findLargestPalindromeMadeFromProductOfNumber);

    }

    public static long sumSquare (int number) {

        //vou tentar
        long totalSquare = 0;
        long sumSquare = 0;
        for(int i = 1; i <= number; i++) {
            sumSquare += Math.pow(i,2);
            totalSquare += i;
        }


        return (long) Math.pow(totalSquare,2) - sumSquare;

    }

    public static boolean isPalindrome(long number){

        //fiz com string
        String str = String.valueOf(number);
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            return true;
        }
        return false;
    }

    public static long findLargestPalindromeMadeFromProductOfNumber (int number) {

        long palindrome = 0;

        long largestNumber = (long) Math.pow(10,number) - 1;
        long lowestNumber = (long) Math.pow(10,number-1);

        for(long i = largestNumber ; i >= lowestNumber; i--) {
            for(long j = largestNumber; j >= lowestNumber; j--) {
                if (isPalindrome(i * j)) {
                    if (i * j > palindrome) {
                        palindrome = i * j;
                    }
                }
            }
        }
        return palindrome;
    }



}
