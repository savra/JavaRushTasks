package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int number = 0;
        int max = 0;
        while (fileInputStream.available() > 0) {
            number = fileInputStream.read();
            max = Math.max(max, number);
        }

        System.out.println(max);
        bufferedReader.close();
        fileInputStream.close();
    }
}
