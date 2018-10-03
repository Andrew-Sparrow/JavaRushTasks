package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

         /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++)
        {
            list.add(bufferedReader.readLine());
        }*/
        Collections.addAll(list, "run", "recon", "solly", "ddr");

        int max = list.get(0).length() ;

        for (int i = 0; i < list.size(); i++)
        {
            if(max<list.get(i).length())
            {
                max = list.get(i).length();
            }
        }

        if(max== list.size()-1)
        {
            System.out.println("список упорядочен по возрастанию");
        }
        else
        System.out.println(list.get(max));

    }
}

