package com.company;

import java.util.Scanner;

public class Hello {
    static boolean ok;
    static byte b;
    static char c;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1);


        System.out.println(ok);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        int resultMethod = Hello.method(5, 10);
        //System.out.println(resultMethod);
        String s = "hello world";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('e'));
        Integer i;
        Double d = 31.05;
    }

    public static int method(int a, int b) {
        int result = a + b;
        return result;
    }

    void method2() {
        System.out.println("hello");
    }
}