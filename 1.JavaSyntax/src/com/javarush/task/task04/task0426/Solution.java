package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String result = "";

        if (number == 0) {
            result = "ноль";
        } else {
            if (number < 0)
                result = "отрицательное ";
            else if (number > 0)
                result = "положительное ";

            if(number % 2 == 0)
                result += "четное число";
            else
                result += "нечетное число";
        }

        System.out.println(result);


    }
}
