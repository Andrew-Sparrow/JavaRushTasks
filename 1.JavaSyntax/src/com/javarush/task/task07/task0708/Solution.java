package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> arrayList = new ArrayList();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        for (int i = 0; i < 5; i++)
        {
            arrayList.add(bufferedReader.readLine());
        }

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }


    }
}
