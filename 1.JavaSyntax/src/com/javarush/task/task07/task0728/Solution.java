package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = {0, -1 , 4, 3, 7};
/*
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
*/
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        for (int i = 0; i < array.length-1; i++)
        {
            int max = array[i];

            for (int j = i+1; j < array.length; j++)
            {
                if(array[j] > max)
                {
                    max = array[j];

                    int swap = array[i];

                    array[i] = max ;

                    array[j] = swap;

                }
            }
        }
    }
}
