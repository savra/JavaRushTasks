package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        String tmp;

        for (tmp = reader.readLine(); !tmp.equals("end"); tmp = reader.readLine())
            list.add(tmp);

        list.forEach(System.out::println);
    }
}