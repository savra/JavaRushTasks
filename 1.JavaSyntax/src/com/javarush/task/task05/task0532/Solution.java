package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if(n > 0) {
            int i = 0;
            int maximum = Integer.parseInt(reader.readLine());
            int currentNumber;


            while(i < n - 1) {
                if((currentNumber = Integer.parseInt(reader.readLine())) >= maximum) {
                    maximum = currentNumber;
                }
                i++;
            }

            System.out.println(maximum);
        }
    }
}
