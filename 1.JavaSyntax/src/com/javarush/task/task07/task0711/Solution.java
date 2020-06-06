package com.javarush.task.task07.task0711;

/*
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            list.add(bufferedReader.readLine());

        String temp;

        for (int i = 0; i < 13; i++) {
            temp = list.remove(list.size() - 1);
            list.add(0, temp);
        }

        list.forEach(System.out::println);
    }
}
