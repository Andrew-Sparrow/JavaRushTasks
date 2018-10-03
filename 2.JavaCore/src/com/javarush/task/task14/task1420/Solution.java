package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
//        try
//        {
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
            String         s1              = bufferedReader1.readLine();


            //Integer absNumber1 = Math.abs(number1);

            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
            String         s2              = bufferedReader2.readLine();
            Integer        number1         = Integer.parseInt(s1);
            Integer        number2         = Integer.parseInt(s2);

            //Integer absNumber2 = Math.abs(number2);

            if(  number1 <= 0 || number2 <= 0 ) throw new Exception();

        System.out.println(findGCD(number1, number2));

//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
    }

    private static int findGCD(int i1, int i2)
    { //base case
        if (i2 == 0)
        {
            return i1;
        }
        return findGCD(i2, i1 % i2);
    }


}



