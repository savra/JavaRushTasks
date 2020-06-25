package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.logging.Logger;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String fileContent = "";
        Logger k = Logger.getLogger("s");

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            k.info("fff");
            return fileContent;
        }

        @Override
        public void run() {
            if (fullFileName != null) {
                String line = "";
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fullFileName))) {
                    while ((line = bufferedReader.readLine()) != null) {
                        fileContent += line + " ";
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Файл не найден");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
