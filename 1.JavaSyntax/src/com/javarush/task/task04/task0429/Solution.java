package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int positiveCount = 0;
        int negativeCount = 0;

        if(a > 0) positiveCount++;
        else if (a < 0) negativeCount++;

        if(b > 0) positiveCount++;
        else if (b < 0) negativeCount++;

        if(c > 0) positiveCount++;
        else if (c < 0) negativeCount++;

        System.out.println("количество отрицательных чисел: " + negativeCount + " , " + "количество положительных чисел: " + positiveCount);

    }
}
