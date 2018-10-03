package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int[] array ;//= new int[10];
        
        int[] array = {10, 4, 17, 66 ,2, 8, 4, 66, 9, 77};
        /*
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
*/
        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) 
        {
          list.add(array[i]);
        }
        
        Collections.sort(list);
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++)
        {
            array[i] = list.get(i);
        }

        //System.out.println(array);
    }
}
