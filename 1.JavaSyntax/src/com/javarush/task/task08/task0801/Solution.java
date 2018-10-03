package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set  = new HashSet<>();

        Collections.addAll(set,  "арбуз", "банан", "вишня");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        }

    }
}
