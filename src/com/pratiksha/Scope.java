package com.pratiksha;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
//        int c = 90;
//        System.out.println(c);
        System.out.println("original value of a is : " + a );

        {
            a = 78;  //  already initialized outside the block in same method hence you can't re-initialized it...
               int c = 99;
               a = 100;  // re-Assigning the original reference variable

              System.out.println("A is Inside the block is  " + a);
              System.out.println("C is " + c );

             // values initialised in this block cannot be used in outside the block

            for(int i = 0; i < 5; i++){
                System.out.println(i);
                int num = 90;
                 a = 10;
            }
        }

          System.out.println("A is  OutSide the block is " + a);
          //  System.out.println(c);  // here c cant we used in outside the block
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}
