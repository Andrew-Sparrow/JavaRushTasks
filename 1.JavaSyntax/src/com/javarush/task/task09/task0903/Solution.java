package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {

        method2();

        int s = 1 ;

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        s = stackTraceElements[2].getLineNumber();

        System.out.println("s1= "+ s);

        return s;
    }

    public static int method2() {

        int s = 1 ;

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        s = stackTraceElements[2].getLineNumber();

        System.out.println("s2= "+ s);

        return s;
    }


}
