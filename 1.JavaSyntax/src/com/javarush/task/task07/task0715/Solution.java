package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(6);
        list.add("мама");
        list.add("мыла");
        list.add("раму");


        for(int i = 1; i <= 5; i += 2)
            list.add(i, "именно");

        for(String str : list)
            System.out.println(str);
    }

}
