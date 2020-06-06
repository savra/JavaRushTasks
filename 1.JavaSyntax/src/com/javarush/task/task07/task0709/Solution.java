package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(5);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            list.add(bufferedReader.readLine());

        Optional<String> minLength = list.stream().min(Comparator.comparingInt(String::length));

        list.stream().filter(x -> (minLength.map(String::length).orElse(0)) == x.length()).forEach(System.out::println);
    }
}
