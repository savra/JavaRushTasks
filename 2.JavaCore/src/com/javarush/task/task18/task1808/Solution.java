package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();
            String fileName3 = bufferedReader.readLine();

            //try (FileInputStream fileInputStream = new FileInputStream("..\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1808\\" + fileName1)) {
            try (FileInputStream fileInputStream = new FileInputStream(fileName1)) {
                int count;
                int fileAvailable = fileInputStream.available();
                byte[] fileBuffer = new byte[fileAvailable % 2 != 0 ? fileAvailable / 2 + 1 : fileAvailable / 2];
                count = fileInputStream.read(fileBuffer);
                //try (FileOutputStream fileOutputStream = new FileOutputStream("..\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1808\\" + fileName2)) {
                try (FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {
                    fileOutputStream.write(fileBuffer, 0, count);
                }
                fileBuffer = new byte[fileInputStream.available()];
                count = fileInputStream.read(fileBuffer);
                //try (FileOutputStream fileOutputStream = new FileOutputStream("..\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1808\\" + fileName3)) {
                try (FileOutputStream fileOutputStream = new FileOutputStream(fileName3)) {
                    fileOutputStream.write(fileBuffer, 0, count);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
