package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> arrayList = new ArrayList();

        Collections.addAll(arrayList, "мама", "мыла","раму");

        ArrayList<String> arrayList2 = new ArrayList();
    
        for (int i = 0; i < 3; i=i+2)
        {
            arrayList2.add(arrayList.get(i));
            arrayList2.add(i+1, "именно");
        }

        System.out.println(arrayList);

    }
}
