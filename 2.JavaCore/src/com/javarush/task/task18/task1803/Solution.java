package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        Map<Integer, Integer> map = new HashMap<>(200);

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int number;

        while (fileInputStream.available() > 0) {
            number = fileInputStream.read();
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else map.put(number, 1);
        }

        fileInputStream.close();
        int max = Collections.max(map.values(), Integer::compare);

        map.forEach((key, value) -> {
            if (max == value) System.out.print(key + " ");
        });

        bufferedReader.close();
    }
}
