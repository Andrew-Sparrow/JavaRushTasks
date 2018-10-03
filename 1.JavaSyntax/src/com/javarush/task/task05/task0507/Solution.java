package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution  {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {

            int sum = 0;
            int count = 0;
            double average = 0;

            for (; true; )
            {
                String s = reader.readLine();
                int i = Integer.parseInt(s);

                if (i != -1)
                {
                    sum = sum + i;
                    count++;
                }
                else
                {
                    average = (double) sum/(double) count;
                    break;

                }
            }
            System.out.println(average);
        }
        catch (IOException e)
        {
            System.out.println( e);
        }
    }
}

