package com.epam.courses;

public class Task3 {


    public static void main(String [] args){
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int intNumber = Integer.MAX_VALUE;
        long longNumber = Long.MAX_VALUE;

        System.out.println(countBits(byteNumber));
        System.out.println(countBits(shortNumber));
        System.out.println(countBits(intNumber));
        System.out.println(countBits(longNumber));

    }

    static int countBits(byte number){
        int count = 1;
        while (number != 0){
            count ++;
            number >>= 1;
        }
        return count;
    }
    static int countBits(short number){
        int count = 1;
        while (number != 0){
            count ++;
            number >>= 1;
        }
        return count;
    }
    static int countBits(int number){
        int count = 1;
        while (number != 0){
            count ++;
            number >>= 1;
        }
        return count;
    }
    static int countBits(long number){
        int count = 1;
        while (number != 0){
            count ++;
            number >>= 1;
        }
        return count;
    }

}
