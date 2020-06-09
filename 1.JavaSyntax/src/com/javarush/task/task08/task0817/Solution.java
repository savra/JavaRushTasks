package com.javarush.task.task08.task0817;

import sun.security.x509.GeneralName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        for (Map.Entry<String, String> stringStringEntry : map.entrySet())
            removeItemFromMapByValue(map, stringStringEntry.getValue());
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
