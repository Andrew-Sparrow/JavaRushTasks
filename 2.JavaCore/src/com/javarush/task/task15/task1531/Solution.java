package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = 150;//Integer.parseInt(reader.readLine());
        //reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n)
    {
        //add your code here

        BigDecimal result = BigDecimal.valueOf(1);

        String strResult = "";

        if(n <= 150 && n > 0)
        {
            for (int i = 1; i <= n; i++)
            {
                result = result.multiply(BigDecimal.valueOf(i));
            }

            strResult = String.valueOf(result);
        }
        else if(n<0)
        {
            strResult = String.valueOf(0);
        }
        else if(n==0)
        {
            strResult = String.valueOf(1);
        }
        else if( n>150)
        {
            strResult = " n must be => 150 !";
        }

        return strResult;

    }
}
