package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        double sum = 0;
        int numberCount = 0;

        while(n != -1)
        {
            numberCount++;
            sum += n;
            n = Integer.parseInt(bufferedReader.readLine());
        }

        if(numberCount != 0)
            System.out.println(sum / numberCount);
    }
}

