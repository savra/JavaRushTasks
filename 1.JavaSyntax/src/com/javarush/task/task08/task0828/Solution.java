package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        String str = bufferedReader.readLine();
        Month j = Month.valueOf(str.toUpperCase());
        System.out.println(str + " is the " + j.getValue() + " month ");
    }
}
