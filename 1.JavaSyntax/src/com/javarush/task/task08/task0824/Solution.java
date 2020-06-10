package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human();
        child1.name = "child1";
        child1.sex = false;
        child1.age = 12;

        Human child2 = new Human();
        child2.name = "child2";
        child2.sex = true;
        child2.age = 10;

        Human child3 = new Human();
        child3.name = "child3";
        child3.sex = false;
        child3.age = 13;

        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 36;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 32;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human grandMother1 = new Human();
        grandMother1.name = "grandMother1";
        grandMother1.sex = false;
        grandMother1.age = 65;
        grandMother1.children.add(father);

        Human grandMother2 = new Human();
        grandMother2.name = "grandMother2";
        grandMother2.sex = false;
        grandMother2.age = 66;
        grandMother2.children.add(mother);

        Human grandFather1 = new Human();
        grandFather1.name = "grandFather1";
        grandFather1.sex = true;
        grandFather1.age = 67;
        grandFather1.children.add(father);

        Human grandFather2 = new Human();
        grandFather2.name = "grandFather2";
        grandFather2.sex = true;
        grandFather2.age = 68;
        grandFather2.children.add(mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public List<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
