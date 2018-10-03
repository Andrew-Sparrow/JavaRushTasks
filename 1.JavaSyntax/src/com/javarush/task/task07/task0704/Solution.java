package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] intarr = new int[3];
    
        for (int i = 0; i < intarr.length; i++)
        {
            intarr[i] = Integer.parseInt(bufferedReader.readLine());

        }
    
        for (int i = intarr.length - 1; i >= 0  ; i--)
        {
            System.out.println(intarr[i]);
        }

    }
}

