package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);

        for (String str : result)
            System.out.println(str);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int listSize = list.size() * 2;
        for (int i = 0; i < listSize; i += 2)
            list.add(i + 1, list.get(i));
        return list;
    }
}
