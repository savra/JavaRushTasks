package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> stringArrayList = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
            stringArrayList.add(reader.readLine());

        int i = 0;

        while (i < m) {
            stringArrayList.add(stringArrayList.remove(0));
            i++;
        }

        stringArrayList.forEach(System.out::println);
    }
}
