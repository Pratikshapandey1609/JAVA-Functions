package com.pratiksha;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {

        // shadoeing  in java is using two variables with same name  in same methods which overlaps each other known as shadowing

        System.out.println(x);

        int x = 20;
        System.out.println(x);

        fun();  // 90 because fun function  has local variable scope
        System.out.println(x);
    }

    static void fun() {
        System.out.println(x);
    }
}
