package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int[] intarr1 = new int[6] ;
        int[] intarr2 = new int[3] ;
        int[] intarr3 = new int[3] ;
    
        for (int i = 0; i < intarr1.length ; i++)
        {
            intarr1[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < intarr1.length ; i++)
        {
            if (i < intarr2.length)
            {
                intarr2[i] = intarr1[i];
            }
            else
            {
                intarr3[i - intarr2.length] = intarr1[i];
            }
        }
    
        for (int i = 0; i < intarr3.length ; i++)
        {
            System.out.println(intarr3[i]);
        }


    }
}
