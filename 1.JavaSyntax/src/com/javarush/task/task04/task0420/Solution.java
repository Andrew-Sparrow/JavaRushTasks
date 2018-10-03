package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int mid = 0;
        int min = 0;

        String s1 = reader.readLine();
        int i1 = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int i2 = Integer.parseInt(s2);

        String s3 = reader.readLine();
        int i3 = Integer.parseInt(s3);

        if(i1 == max3(i1, i2, i3))
        {
            max= i1;
            mid = max(i2, i3);

            if(i2 == mid)
            {
                min = i3;
            }
            else min = i2;
        }

        if(i2 == max3(i1, i2, i3))
        {
            max= i2;
            mid = max(i1, i3);

            if(i1 == mid)
            {
                min = i3;
            }
            else min = i1;
        }

        if(i3 == max3(i1, i2, i3))
        {
            max= i3;
            mid = max(i1, i2);
            if(i1 == mid)
            {
                min = i2;
            }
            else min = i1;
        }


        System.out.println(max+" "+mid+" "+min);
    }


    public static int max(int f1, int f2)
    {
        int max ;

        if (f1 > f2  )
        {
            max = f1;

        }
        else
        max = f2;


        return max;
    }


    public static int max3(int e1, int e2, int e3)
    {
        int max3 ;

        max3 = max(max(e1, e2), e3);

        return max3;
    }

}
