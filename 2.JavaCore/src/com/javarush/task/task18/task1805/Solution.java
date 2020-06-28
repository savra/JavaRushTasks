package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        bufferedReader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        Set<Integer> integerSet = new TreeSet<>();

        while (fileInputStream.available() > 0) {
            integerSet.add(fileInputStream.read());
        }

        fileInputStream.close();

        integerSet.forEach((x) -> System.out.print(x + " "));
    }
}
