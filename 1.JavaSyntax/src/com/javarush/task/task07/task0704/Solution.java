package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++)
            ints[i] = Integer.parseInt(bufferedReader.readLine());

        for (int i = ints.length - 1; i >= 0; i--)
            System.out.println(ints[i]);
    }
}

