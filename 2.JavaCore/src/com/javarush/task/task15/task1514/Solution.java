package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution
{
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args)
    {
        System.out.println(labels);
    }

    static {

        labels.put(5.0, "asdf");
        labels.put(6.0, "asdf");
        labels.put(54.0, "asdf");
        labels.put(51.0, "asdf");
    }
}
