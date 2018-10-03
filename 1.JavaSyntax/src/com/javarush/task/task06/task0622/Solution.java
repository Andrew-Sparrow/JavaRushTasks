package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer num ;

        for(int i = 0 ; i< 3 ; i++)
        {
            num = Integer.parseInt(reader.readLine());
            arrayList.add(num);
        }

        arrayList.sort( Comparator.reverseOrder());

        for(int i = 0 ; i< arrayList.size() ; i++)
        {
            System.out.println(arrayList.get(i));
        }


    }
}
