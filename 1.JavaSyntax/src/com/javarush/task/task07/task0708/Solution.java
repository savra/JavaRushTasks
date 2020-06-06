package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
            if (maxLength < strings.get(i).length())
                maxLength = strings.get(i).length();
        }

        final int max = maxLength;

        strings.stream().filter((y) -> y.length() == max).forEach(System.out::println);
    }
}
