package com.pratiksha;

public class FunctionOverloading {
    public static void main(String[] args) {

        // when we have  two or more functions with same name in same methods
        // but different in arguments is known as  Function Overloading

//        Tamater(78);// when value is integer
//        Tamater("Tomato");  // when value is String

          int ans =  sum(5 , 8 , 90);
          System.out.println("Answer of the sumation is : " + ans);
    }

    static int  sum(int a , int b){
        return a + b ;
    }


    static int  sum(int a , int b , int c){
        return a + b + c ;
    }

    static void Tamater(int a) {
        System.out.println("First One");
        System.out.println("Ahh tamater 1 kg tamater is  : " + a);

    }

    static void Tamater(String naam) {
        System.out.println("Second One");
        System.out.println("Ahh tamater english name is...: " +  naam);
    }
}
