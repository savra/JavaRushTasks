package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        int max = a;

        if(a >= b & a >= c & a >= d)
            max = a;
        else if(b >= a & b >= c & b >= d)
            max = b;
        else if(c >= a && c >= b && c >= d)
            max = c;
        else if(d >= a && d >= b && d >= c)
            max = d;

        System.out.println(max);
    }
}
