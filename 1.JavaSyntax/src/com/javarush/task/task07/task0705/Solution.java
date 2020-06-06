package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[20];
        int[] ints2 = new int[10];
        int[] ints3 = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ints.length; i++)
            ints[i] = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0, j = 0, k = 0; i < ints.length; i++)
            if (i <= 9)
                ints2[j++] = ints[i];
            else
                ints3[k++] = ints[i];

        for (int value : ints3) System.out.println(value);
    }
}
