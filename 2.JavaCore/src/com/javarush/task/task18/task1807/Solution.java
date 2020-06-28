package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + fileName + " не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int commaCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] bytes = new byte[1024];
            int count;
            while (fileInputStream.available() > 0) {
                count = fileInputStream.read(bytes);
                for (byte curByte : bytes)
                    if (curByte == 44) commaCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + fileName + " не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(commaCount);
    }
}
