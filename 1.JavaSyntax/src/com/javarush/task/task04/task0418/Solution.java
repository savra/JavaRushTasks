package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a =  Integer.parseInt(bufferedReader.readLine());
        int b =  Integer.parseInt(bufferedReader.readLine()) ;

        if (a <= b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}