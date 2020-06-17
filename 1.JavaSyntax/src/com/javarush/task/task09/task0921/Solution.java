package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                Integer n = Integer.parseInt(bufferedReader.readLine());
                list.add(n);
            }
        } catch (NumberFormatException e) {
            list.forEach(System.out::println);
        } catch (IOException e) {

        }
    }
}
