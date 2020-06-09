package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>(10);
        map.put("Трефилкин", "Дмитрий");
        map.put("Иванов", "Андрей");
        map.put("Сидоров", "Андрей");
        map.put("Панов", "Иван");
        map.put("Сомсин", "Иван");
        map.put("Егоров", "Сергей");
        map.put("Маркин", "Сергей");
        map.put("Поляков", "Иван");
        map.put("Сергеев", "Иван");
        map.put("Веселов", "Иван");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int sameCount = 0;
        for (String entry : map.values())
            if (entry.equals(name))
                sameCount++;

        return sameCount;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int sameCount = 0;

        for (String entry : map.keySet())
            if (entry.equals(lastName))
                sameCount++;

        return sameCount;
    }

    public static void main(String[] args) {

    }
}
