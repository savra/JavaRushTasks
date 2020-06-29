package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();

            //try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\savra\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1809\\1.txt");
                  try (FileInputStream fileInputStream = new FileInputStream(fileName1);
                 //FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\savra\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1809\\2.txt")) {
                  FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {
                byte[] bytes = new byte[fileInputStream.available()];
                int count = 0;
                count = fileInputStream.read(bytes);

                for (int i = bytes.length - 1; i >= 0; i--)
                    fileOutputStream.write(bytes[i]);

            }
        } catch (IOException e) {

        }
    }
}
