package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArrayLesson {

    public static void main(String[] args) {
        int[] array = {1, 2, 3}; // [1][2][3]

        System.out.println(array[2]);

        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Random().nextInt() + 10;
        }

        int num = 0;
        while (num < 5) {
            System.out.println("Hello");
            num++;
        }

        int num1 = 0;
        do {
            System.out.println("World");
            num1++;
        } while (num1 < 5);

        System.out.println(Arrays.toString(array1));


        byte[] b;
        char[] c = {'h', 'e', 'l', 'l', 'o'};

//        if (5 > 10) { // false
//            System.out.println("It's true");
//        } else if (5 >= 10) { // false
//            System.out.println();
//        } else if () {
//            System.out.println("It's false");
//        } else if () {
//
//        } else {
//
//        }

    }

    public void switchConstruct() {
        int choice = 1;

        switch (choice) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("");
        }
    }
}
