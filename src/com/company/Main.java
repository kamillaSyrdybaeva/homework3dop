package com.company;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	int [] array = {-4, -2, 2, 3, 6, 8,};
    for (int i = 0; i < array.length; i ++ ) {
        System.out.println(array[i]);
    }
        for (int left = 8; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i --)
                if (value < array[i]) {
                    array[i + 1] = array[i];
                }else{
                break;

            }
            array [i+1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
