package com.pratiksha;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        //  Variable length arguments, also known as varargs,
        //  It's a  feature in java  that allows functions to accept an arbitrary number of arguments.

       // fun(2 , 3, 4, 67, 90, 98, 67, 3, 53, 89, 65);
        demo(2 , 3 , 4 );
        demo("pratiksha" , "riya", "sneha");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void  multiple(int a , int b , int ...c){
        System.out.println("multiple values is allowed ");
    }
}
