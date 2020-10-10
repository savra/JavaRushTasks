package com.javarush.task.task14.task1419;


import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.acl.AclNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new RuntimeException());
            exceptions.add(new NullPointerException());
            exceptions.add(new AclNotFoundException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new IllegalStateException());
            exceptions.add(new ActivationException());
            exceptions.add(new NoSuchMethodException());
            exceptions.add(new AlreadyBoundException());
        }



        //напишите тут ваш код

    }
}
