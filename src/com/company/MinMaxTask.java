package com.company;

import java.util.Arrays;

public class MinMaxTask {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(array));

        int min = 100;
        for (int i = 0; i < array.length; i++) { //6,3,4,6,1
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
