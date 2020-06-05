package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        String n;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(!(n = bufferedReader.readLine()).equals("сумма")) {
            sum += Integer.parseInt(n);
        }

        System.out.println(sum);
    }
}
