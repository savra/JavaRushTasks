package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        String town;
        while (true) {
            String family = reader.readLine();

            if (family.isEmpty()) {
                break;
            }

            town = reader.readLine();

            if (town.isEmpty()) {
                break;
            }

            map.put(family, town);
        }

        // Read the house number
        town = reader.readLine();

        if (!town.isEmpty()) {
            String familyName = map.get(town);
            System.out.println(familyName);
        }
    }
}
