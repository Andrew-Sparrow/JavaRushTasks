package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = {1, 6, 5, 7, 1, 15, 63, 88};



        /*for (int i = 0; i < 30; i++) {

            array[i] = Integer.parseInt(reader.readLine());
        }*/

        sortAr(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
    }

    public static void sortAr(int[] array) {
        //напишите тут ваш код

        //ArrayList<Integer> arrayList = new ArrayList<Integer>(array);

        Arrays.sort(array);

    }
}
