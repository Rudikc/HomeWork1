package com.epam.courses;

public class Task4 {

    public static void main(String[] args) {

        System.out.println(gcd(16, 8));

    }

    private static int gcd(int a, int b) {

        if (a == b) return a;


        while (true) {
            if (a > b) a = a + (~b + 1);
            else b = b + (~a + 1);


            if (a == 0) return b;
            else if (b == 0) return a;
        }
    }
}
