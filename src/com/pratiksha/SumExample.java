package com.pratiksha;

import java.util.Scanner;

public class SumExample {
    public static void main(String[] args){

//        sum();
        int ans =  sum3(20, 50);
        System.out.println("passing the value of a and b in parameters  " +  ans);
    }

    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }

//    public static void sum(){
//        int num1 , num2 , sum ;
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter number one : = ");
//        num1 = in.nextInt();
//        System.out.println("Enter number two : = ");
//        num2 = in.nextInt();
//
//        int result = num1 + num2;
//
//        System.out.println("Sum of two numbers is : " + result);
//
//    }
}
