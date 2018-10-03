package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

import java.util.*;

import java.util.Arrays.*;

import java.util.List;

import static java.lang.StrictMath.E;
import static java.util.Arrays.asList;
import static java.util.Arrays.sort;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);

        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        int minArr = array[0];

        int ind = 0;
    
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < minArr)
            {
                minArr = array[i];
                ind = i;
            }
        }

        return new Pair<Integer, Integer>(minArr, ind);
    }
    

    
    
    public static class Pair <X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
