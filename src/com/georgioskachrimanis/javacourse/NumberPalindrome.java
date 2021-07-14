package com.georgioskachrimanis.javacourse;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    public static int reverseNumber (int number) {

        int reverse = 0;
        boolean sign = false;
        if (number < 0) {
            sign = true;
            number = number *(-1);
        }

        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        if (sign){
            return reverse * (-1);
        }
        return reverse;
    }
}

