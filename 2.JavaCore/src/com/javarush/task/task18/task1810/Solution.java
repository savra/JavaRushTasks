package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;
            while ((fileName = bufferedReader.readLine()) != null) {
                //try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\savra\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1810\\1.txt")) {
                //if (Files.size(Paths.get("C:\\Users\\savra\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1810\\1.txt")) < 1000) throw new DownloadException();
                if (Files.size(Paths.get(fileName)) < 1000) throw new DownloadException();
            }
        } catch (IOException e) {

        }
    }

    public static class DownloadException extends Exception {

    }
}
