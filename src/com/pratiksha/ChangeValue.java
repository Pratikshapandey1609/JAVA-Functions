package com.pratiksha;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 78, 8, 34,81};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int [] nums){
        nums[3] = 67;

    }
}
