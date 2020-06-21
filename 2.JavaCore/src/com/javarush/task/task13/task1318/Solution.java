package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReader.readLine();
            try (InputStream fileInputStream = new BufferedInputStream(new FileInputStream("./2.JavaCore/src/com/javarush/task/task13/task1318/" + fileName))) {
                while (fileInputStream.available() > 0) {
                    System.out.print((char) fileInputStream.read());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}