package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Трефилкин", 544);
        map.put("Иванов", 2222);
        map.put("Сидоров", 543535);
        map.put("Панов", 6546464);
        map.put("Сомсин", 342765);
        map.put("Егоров", 33);
        map.put("Маркин", 5555);
        map.put("Поляков", 1212);
        map.put("Сергеев", 99);
        map.put("Веселов", 77);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        Map.Entry<String, Integer> currentEntry;

        while (iterator.hasNext()) {
            currentEntry = iterator.next();

            if (currentEntry.getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}