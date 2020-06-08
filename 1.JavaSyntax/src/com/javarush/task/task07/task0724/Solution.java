package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("grandFather1", Boolean.TRUE, 65);
        Human grandFather2 = new Human("grandFather2", Boolean.TRUE, 55);

        System.out.println(grandFather1);
        System.out.println(grandFather2);

        Human grandMother1 = new Human("grandMother1", Boolean.FALSE, 55);
        Human grandMother2 = new Human("grandMother2", Boolean.FALSE, 45);

        System.out.println(grandMother1);
        System.out.println(grandMother2);

        Human mother = new Human("mother", Boolean.FALSE, 35, grandFather1, grandMother1);
        Human father = new Human("father", Boolean.TRUE, 36, grandFather2, grandMother2);

        System.out.println(mother);
        System.out.println(father);

        Human child1 = new Human("child1", Boolean.FALSE, 15, father, mother);
        Human child2 = new Human("child2", Boolean.TRUE, 12, father, mother);
        Human child3 = new Human("child3", Boolean.TRUE, 13, father, mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}