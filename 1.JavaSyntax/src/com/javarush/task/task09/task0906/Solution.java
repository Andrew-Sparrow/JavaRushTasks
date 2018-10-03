package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        log("In method1");
    }

    public static void log(String s) {
        //напишите тут ваш код

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        String className = elements[2].getClassName();

        String nameMethod = elements[2].getMethodName();

        System.out.println(className + ": "+ nameMethod + ": " +s);
    }
}
