package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Character character = date.charAt(0);
        String str = Character.toUpperCase(character) + date.substring(1).toLowerCase();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate destDate = LocalDate.parse(str, dateTimeFormatter);

        LocalDate startYear = LocalDate.of(destDate.getYear(), 1, 1);

        long daysBetween = ChronoUnit.DAYS.between(startYear, destDate);

        return daysBetween % 2 == 0;
    }
}
