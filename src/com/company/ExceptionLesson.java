package com.company;

import java.io.File;
import java.io.IOException;

public class ExceptionLesson {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Danylo Bubniy\\Desktop\\stray-animals\\lessons\\src\\text.txt");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            System.out.println("FAILED!");
        }


        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("DIVISION BY 0");
        }

    }

    public void sa() {
    }
}
