package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String weekDay = "такого дня недели не существует";
        switch(number) {
            case 1: weekDay = "понедельник"; break;
            case 2: weekDay = "вторник"; break;
            case 3: weekDay = "среда"; break;
            case 4: weekDay = "четверг"; break;
            case 5: weekDay = "пятница"; break;
            case 6: weekDay = "суббота"; break;
            case 7: weekDay = "воскресенье"; break;
            default: break;
        }

        System.out.println(weekDay);
    }
}