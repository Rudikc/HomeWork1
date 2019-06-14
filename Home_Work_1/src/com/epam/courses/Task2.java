package com.epam.courses;

public class Task2 {

    public static void main(String[] args) {

        int number = 100;
        reverse(number);
    }

    static void reverse(int number) {
        System.out.println(~number + 1);
    }

}
