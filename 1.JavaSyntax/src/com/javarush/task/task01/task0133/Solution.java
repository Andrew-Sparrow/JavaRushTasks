package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds)
    {

        //напишите тут ваш код
        int rest;
        int single_div = seconds/3600;

        rest = seconds - single_div * 3600;
        return rest;
    }
}