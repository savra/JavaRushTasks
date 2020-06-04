package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        int quarter;

        if (a > 0 && b > 0)
            quarter = 1;
        else if(a < 0 && b > 0)
            quarter = 2;
        else if(a < 0 && b < 0)
            quarter = 3;
        else
            quarter = 4;

        System.out.println(quarter);
    }
}
