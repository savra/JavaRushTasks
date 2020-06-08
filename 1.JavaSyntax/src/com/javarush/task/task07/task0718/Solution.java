package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>(10);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++)
            list.add(bufferedReader.readLine());

        int result = -1;

        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).length() > list.get(i + 1).length()) {
                result = i + 1;
                break;
            }
        }

        if(result != -1)
            System.out.println(result);
    }
}

