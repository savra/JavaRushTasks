package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //strings.add("лира");
        // strings.add("ика");

        strings.add("ира");
        strings.add("липа");
        fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        String currentString;
        int i = 0, size = strings.size();

        while (i <= size - 1) {
            currentString = strings.get(i);
            if (currentString.chars().anyMatch(x -> x == 'р')) {
                if (currentString.chars().noneMatch(x -> x == 'л')) {
                    strings.remove(i);
                    size--;
                } else i++;
            } else if (currentString.chars().anyMatch(x -> x == 'л')) {
                strings.add(currentString);
                i++;
            } else i++;
        }

        return null;
    }
}