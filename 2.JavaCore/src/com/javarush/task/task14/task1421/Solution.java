package com.javarush.task.task14.task1421;

import com.javarush.task.task14.task1421.Singleton;

/*
Singleton
*/
public class Solution
{
    public static void main(String[] args)
    {
//        Singleton s = new Singleton();
        Singleton q = Singleton.getInstance();

        Cat cat = new Cat();

        System.out.println(cat.getName());

        Tiger tiger = new Tiger();
        String s = tiger.getName();
        System.out.println(s);

        Cat catTiger = new Tiger();
        catTiger.getName();

        String s2 = catTiger.getName();
        System.out.println(s2);


    }


}
