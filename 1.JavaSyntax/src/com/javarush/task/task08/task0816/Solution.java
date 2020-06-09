package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сомсин", dateFormat.parse("JUNE 5 2010"));
        map.put("Сергеев", dateFormat.parse("MAY 1 2017"));
        map.put("Веселов", dateFormat.parse("MAY 1 2011"));
        map.put("Иванов", dateFormat.parse("MAY 1 2010"));
        map.put("Сидоров", dateFormat.parse("JULY 1 2009"));
        map.put("Егоров", dateFormat.parse("MAY 1 2012"));
        map.put("Маркин", dateFormat.parse("JUNE 1 2005"));
        map.put("Поляков", dateFormat.parse("MAY 1 2012"));
        map.put("Панов", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        int chrIndex;

        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            chrIndex = dateFormat.format(entry.getValue()).indexOf(" ");
            String month = dateFormat.format(entry.getValue()).substring(0, chrIndex).trim();

            if ("JULY".equals(month.toUpperCase()) || "JUNE".equals(month.toUpperCase()) || "AUGUST".equals(month.toUpperCase()))
                iterator.remove();
        }


    }

    public static void main(String[] args) throws ParseException {
    }
}
