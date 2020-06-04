package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name  = bufferedReader.readLine();
        int int1 = Integer.parseInt(bufferedReader.readLine());
        int int2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(name + " получает " + int1 + " через " + int2 + " лет.");
    }
}
