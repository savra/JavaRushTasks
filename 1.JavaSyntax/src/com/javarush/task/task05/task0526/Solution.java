package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("name1", 45, "aaa");
        Man man2 = new Man("name2", 46, "bbb");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("name3", 47, "ccc");
        Woman woman2 = new Woman("name4", 48, "ddd");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man() {

        }
        public Man(String name) {
            this.name = name;
        }
        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman() {

        }
        public Woman(String name) {
            this.name = name;
        }
        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

}
