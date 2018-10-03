package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[5];

        /*for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }*/

        array[0] = "ba";
        array[1] = "z";
        array[2] = "a";
        array[3] = "bc";
        array[4] = "as";

        sort(array);

        //System.out.println(isGreaterThan(array[2], array[4] ));

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        String temp = "";

        for (int j = 1; j < array.length-1; j++)
        {
            for (int i = 1; i < array.length-j+1; i++)
            {
                if (isGreaterThan(array[i - 1], array[i]))
                {
                    temp = array[i];

                    array[i] = array[i - 1];

                    array[i - 1] = temp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;
    }
}
