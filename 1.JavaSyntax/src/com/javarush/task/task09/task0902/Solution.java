package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static String method1() {
        method2();
        Deque<StackTraceElement> stack = new LinkedList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
        stack.pop();
        stack.pop();
        return stack.peek().getMethodName();
    }

    public static String method2() {
        method3();
        Deque<StackTraceElement> stack = new LinkedList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
        stack.pop();
        stack.pop();
        return stack.peek().getMethodName();
    }

    public static String method3() {
        method4();
        Deque<StackTraceElement> stack = new LinkedList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
        stack.pop();
        stack.pop();
        return stack.peek().getMethodName();
    }

    public static String method4() {
        method5();
        Deque<StackTraceElement> stack = new LinkedList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
        stack.pop();
        stack.pop();
        return stack.peek().getMethodName();
    }

    public static String method5() {
        Deque<StackTraceElement> stack = new LinkedList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
        stack.pop();
        stack.pop();
        return stack.peek().getMethodName();
    }
}
