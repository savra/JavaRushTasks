package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int sum = 0;
        do {
            n = Integer.parseInt(bufferedReader.readLine());

            sum += n;
        } while (n != -1);

        System.out.println(sum);
    }
}
