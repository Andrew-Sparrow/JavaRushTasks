package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> list = new ArrayList();

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++)
        {
            list.add(bufferedReader.readLine());
        }*/
        Collections.addAll(list, "run", "recon", "solly", "ddr");

        ArrayList<String> result = doubleValues(list);

        System.out.println(result);

        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            char [] chars = new char[list.get(i).length()*2];

            for (int j = 0; j < list.get(i).length(); j = j+ 1)
            {
                int k=2;
                chars[j*k] = list.get(i).charAt(j);
                chars[j*k+1] = list.get(i).charAt(j);
            }

            String str2 = new String(chars);

            list2.add(str2);
        }
        return list2;
    }
}
