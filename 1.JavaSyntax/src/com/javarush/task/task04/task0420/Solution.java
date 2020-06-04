package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[3];
        ints[0] = Integer.parseInt(bufferedReader.readLine());
        ints[1] = Integer.parseInt(bufferedReader.readLine());
        ints[2] = Integer.parseInt(bufferedReader.readLine());

        int temp;
        for(int i = 0; i < ints.length; i++)
            for(int j = i + 1; j < ints.length; j++)
            if (ints[i] < ints[j]) {
                temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
            }

        System.out.println(ints[0] + " " + ints[1] + " " + ints[2]);
    }
}
