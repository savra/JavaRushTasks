package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(bufferedReader.readLine());

        String color = "";

        if(time >= 5)
            time %= 5;

        if(time < 3)
            color = "зелёный";
        else if(time >= 3 && time < 4)
            color = "жёлтый";
        else if(time >= 4 && time < 5)
            color = "красный";

        System.out.println(color);
    }
}