package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++)
        {
            set.add(i);
        }
        System.out.println(set);

        return set ;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
    
        //for (int i = 0; i < set.size(); i++)
        /*for (Integer num: set )
        {
            *//*if(num>10)
            {
                set.remove(num);
            }*//*

            set.remove(11);
        }*/

        ArrayList<Integer> arrayList = new ArrayList<>();

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())
        {
            Integer number = iterator.next();

            if(number>10)
            {
                arrayList.add(number);
            }

        }

        set.removeAll(arrayList);

        System.out.print(set);

        return set;
    }

    public static void main(String[] args) {

        HashSet<Integer> cr = createSet();

        HashSet<Integer> rem_cr = removeAllNumbersMoreThan10(cr);
        /*System.out.println(rem_cr);*/
    }
}