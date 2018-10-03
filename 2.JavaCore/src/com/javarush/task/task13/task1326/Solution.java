package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import javafx.collections.transformation.SortedList;

import java.util.*;
import  java.util.AbstractList.*;
import java.util.Collections.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3 ,4, 4, 3,1,7,2));

        Collections.sort(arrayList);

        for (Integer intg:  arrayList)
        {
            if(intg%2==0)
            System.out.println(intg);
        }
    }
}
