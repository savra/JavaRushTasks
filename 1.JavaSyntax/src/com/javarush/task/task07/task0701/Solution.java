package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] ints = new int[20];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
            ints[i] = Integer.parseInt(bufferedReader.readLine());
        return ints;
    }

    public static int max(int[] array) {
        int maximum = array[0];

        for (int i = 1; i < array.length; i++)
            if (array[i] > maximum)
                maximum = array[i];

        return maximum;
    }
}
