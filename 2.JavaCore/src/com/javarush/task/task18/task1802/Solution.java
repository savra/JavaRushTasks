package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int number, min = 0;

        if(fileInputStream.available() > 0)
            min = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            number = fileInputStream.read();
            min = Math.min(min, number);
        }

        System.out.println(min);
        bufferedReader.close();
        fileInputStream.close();
    }
}
