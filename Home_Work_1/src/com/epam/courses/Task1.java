package com.epam.courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {


    private static int convert(String number) {

         int result = 0;
         char [] charArr = number.toCharArray();

        for (char binary: charArr) {
            result <<= 1;
            if (binary == '1') {
                result |= 1;
            }
        }
        if(charArr[0] == '-'){
            return ~result + 1;
        }else return result;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        System.out.println(convert(number));

    }
}
