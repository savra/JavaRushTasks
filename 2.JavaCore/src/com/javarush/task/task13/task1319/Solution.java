package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(".\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1319\\" + bufferedReader.readLine())))) {
            String inputString;

            do {
                inputString = bufferedReader.readLine();
                bufferedWriter.write(inputString);
                bufferedWriter.newLine();
            } while (!inputString.equals("exit"));
        } catch (IOException e) {
            System.out.println("Ошибка чтения\\записи файла");
        }
    }
}
