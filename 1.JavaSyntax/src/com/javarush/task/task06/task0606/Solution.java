package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int digitCount = (int) Math.log10(n);
        int exp;
        while (digitCount >= 0) {
            exp = (int) Math.pow(10, digitCount);
            if ((n / exp) % 2 == 0)
                even++;
            else odd++;

            n %= exp;
            digitCount--;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
