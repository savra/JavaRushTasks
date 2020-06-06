package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[5];

        for (int i = 0; i < 5; i++)
            ints[i] = Integer.parseInt(reader.readLine());

        int tmp;

        for(int i = 0; i < ints.length; i++)
            for(int j = i +1; j < ints.length; j++){
                if(ints[i] > ints[j]) {
                    tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }

        for (int i  : ints)
            System.out.println(i);
    }
}
