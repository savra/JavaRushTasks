package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[15];
        int evenSum = 0;
        int oddSum = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(bufferedReader.readLine());

            if (i % 2 == 0)
                evenSum += ints[i];
            else
                oddSum += ints[i];
        }

        if (evenSum > oddSum)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
