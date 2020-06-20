package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        List<Character> resultVowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) {
                resultVowels.add(str.charAt(i));
                resultVowels.add(' ');
            } else if (str.charAt(i) != ' ') {
                consonants.add(str.charAt(i));
                consonants.add(' ');
            }

        resultVowels.forEach(System.out::print);
        System.out.println();
        consonants.forEach(System.out::print);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}