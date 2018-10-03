package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(-8, 11);
        closeToTen(15, -7);
    }

    public static void closeToTen(int a, int b)
    {
        //напишите тут ваш код

        int dif_a = 10 - a ;

        int dif_b = 10 - b ;


        if (abs(dif_a) < abs(dif_b))
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }

    public static int abs(int a)
    {
        if (a < 0)
        {
            return -a;
        }
        else
        {
            return a;
        }
    }
}