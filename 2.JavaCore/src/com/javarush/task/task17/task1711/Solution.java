package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        int i = 0;
        switch (args[0]) {
            case "-c":
                while (i < args.length - 1) {
                    try {
                        synchronized (allPeople) {
                            Person person = "м".equals(args[i + 2]) ? Person.createMale(args[i + 1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3])) : Person.createFemale(args[i + 1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]));
                            allPeople.add(person);
                            i += 3;
                            System.out.println(allPeople.size() - 1);
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                break;
            case "-u":
                while (i < args.length - 1) {
                    synchronized (allPeople) {
                        try {
                            Person person = "м".equals(args[i + 3]) ? Person.createMale(args[i + 2], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 4])) : Person.createFemale(args[i + 2], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 4]));
                            allPeople.set(Integer.parseInt(args[i + 1]), person);
                            i += 4;
                        } catch (ParseException e) {
                            e.printStackTrace();
                            break;
                        }
                    }
                }
                break;
            case "-d":
                i = 1;
                synchronized (allPeople) {
                    while (i < args.length) {
                        Person person = Person.createFemale(null, null);
                        person.setSex(null);
                        allPeople.set(Integer.parseInt(args[i]), person);
                        i++;
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    i = 1;
                    while (i < args.length) {
                        System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE ? "м" : "ж") + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        i++;
                    }
                    break;
                }
        }
    }
}
