package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(P005());
        //System.out.println(findLargestPalindromeMadeFromProductOfNumber);

    }

    //Problem 1

    public static long POO1(long number) {
        long sum = 0;
        for(long i = number - 1; i >= 3; i--){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

        return sum;
    }

    //Problem 2

    public static int POO2(){

        int reference = 4000000;
        int evenValues = 2;

        int x = 1;
        int y = 2;

        while (x <= 4000000){
            if(x % 2 == 0){
                evenValues += x;
            }
            int z = x + y;
            x = y;
            y = z;
        }



        return evenValues;


    }


    // Exercise 3

    public static boolean isPrime(Long number){
        boolean isItPrime = true;

        if(number <= 1)
        {
            isItPrime = false;

            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= number/2; i++)
            {
                if ((number % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }

    public static long P003(long number) {

        long aux = number;
        long i = 0;
        long quociente = 0;
        while(aux != 1){
            if(isPrime(i)){
                if(aux % i == 0){
                    quociente = aux / i;
                    aux = quociente;
                }
                else {
                    i++;
                }
            }
            else{
                i++;
            }
        }

        return i;

    }



    //

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

    // Exercise 4

    public static boolean isPalindrome(long number){

        //fiz com string
        String str = String.valueOf(number);
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            return true;
        }
        return false;
    }

    public static long P004(int number) {

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

    //Exercise 5

    public static int P005() {
        boolean aux;


        for(int i = 20; i <= 2147483647; i++){
            aux = true;
            for(int j = 1; j <= 20; j++){
                if(i % j != 0){
                    aux = false;
                    break;
                }
            }
            if (aux){
                return i;
            }
        }

        return -1;
    }



}
