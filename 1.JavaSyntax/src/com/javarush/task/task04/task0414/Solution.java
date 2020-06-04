package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());
        int daysInYear = 0;
        if(year % 400 == 0)
            daysInYear = 366;
        else if(year % 100 == 0)
            daysInYear = 365;
        else if(year % 4 == 0)
            daysInYear = 366;
        else daysInYear = 365;

        System.out.println("количество дней в году: " + daysInYear);
    }
}