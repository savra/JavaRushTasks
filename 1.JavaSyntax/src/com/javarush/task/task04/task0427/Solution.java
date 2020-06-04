package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String result = "";
        int exp;

        if (number >= 1 && number <= 999) {
            if (number % 2 == 0)
                result += "четное ";
            else result += "нечетное ";
            exp = (int) Math.log10(number) + 1;

            if (exp == 1)
                result += "однозначное число";
            else if (exp == 2)
                result += "двузначное число";
            else result += "трехзначное число";

            System.out.println(result);
        }
    }
}
