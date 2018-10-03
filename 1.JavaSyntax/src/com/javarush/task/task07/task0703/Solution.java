package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String[] str_arr = new String[3];
        int[] int_arr = new int[3];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        for(int i = 0; i<str_arr.length; i++)
        {
            String str_reader = bufferedReader.readLine();
            str_arr[i] = str_reader;

            int_arr[i] = str_reader.length();
        }
    
        for ( int i = 0; i < int_arr.length; i++   )
        {
            System.out.println(int_arr[i]);
        }
    }
}
