package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String[] arr = string.trim().split("\\s+");
        String result = "";
        Character firstChr;

        for (String s : arr) {
            firstChr = s.charAt(0);
            result += firstChr.toString().toUpperCase() + s.substring(1) + " ";
        }

        System.out.println(result);
    }
}
