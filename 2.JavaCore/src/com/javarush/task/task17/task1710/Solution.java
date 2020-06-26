package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                try {
                    Sex sex = args[2].equals("м") ? Sex.MALE : Sex.FEMALE;
                    allPeople.add(sex == Sex.MALE ? Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])) : Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                    System.out.println(allPeople.size() - 1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "-u":
                try {
                    Sex sex = args[3].equals("м") ? Sex.MALE : Sex.FEMALE;
                    allPeople.set(Integer.parseInt(args[1]), sex == Sex.MALE ? Person.createMale(args[2], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])) : Person.createFemale(args[2], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])));
                    break;
                } catch (ParseException e) {
                }
            case "-d":
                Person person = allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE ? Person.createMale(null, null) : Person.createFemale(null, null);
                person.setSex(null);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;
            case "-i":
                try {
                    Person pers = allPeople.get(Integer.parseInt(args[1]));
                    String s = pers.getBirthDate().toString();
                    Date d = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse("15/04/1990");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                    String gg = pers.getName() + pers.getSex() + new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(d);
                    System.out.println(pers.getName() + " " + (pers.getSex() == Sex.MALE ? "м" : "ж") + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(pers.getBirthDate()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
