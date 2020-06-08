package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integerList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++)
            integerList.add(Integer.parseInt(reader.readLine()));

        for (int i = integerList.size() - 1; i >= 0; i--)
            System.out.println(integerList.get(i));

    }
}
