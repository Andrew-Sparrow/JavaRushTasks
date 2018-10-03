package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution
{
    public static int A;
    public static int B;

    static  {

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();

            A = Integer.parseInt(s1);
            B = Integer.parseInt(s2);

            bufferedReader.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static final int MIN = min(A, B);

    public static void main(String[] args)
    {
        System.out.println(MIN);
    }

    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
}
