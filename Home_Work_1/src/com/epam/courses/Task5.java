package com.epam.courses;

public class Task5 {


    public static void main(String[] args) {
        System.out.println(change(12, 30));
    }

    private static int change(int a, int pos) {


        int changer = 1 << 32 - pos;
        if((a & changer) != 0){

        }
        return a ^ changer;

//        if (digitToChange == 1) {
//            return a | changer;
//        } else if (digitToChange == 0){
//            return a ^ changer;
//        }
    }
}
