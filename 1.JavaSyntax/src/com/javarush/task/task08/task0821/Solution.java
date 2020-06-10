package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Трефилкин", "Дмитрий");
        map.put("Иванов", "Андрей");
        map.put("Сидоров", "Андрей");
        map.put("Панов", "Иван");
        map.put("Сомсин", "Иван");
        map.put("Егоров", "Сергей");
        map.put("Сергеев", "Сергей");
        map.put("Поляков", "Иван");
        map.put("Сергеев", "Иван");
        map.put("Веселов", "Иван");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
