package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] intrr = new int[15] ;

        int odd = 0 ;
        int even = 0;
    
        for (int i = 0; i < intrr.length; i++)
        {

            intrr[i] = Integer.parseInt(bufferedReader.readLine());
            if(i%2 == 0)
            {
                even += intrr[i];
            }
            else
            {
                odd += intrr[i];
            }
        }

        if(even>odd)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }



    }
}
