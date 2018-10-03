package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {

        Date startYear = new Date();

        startYear.setSeconds(0);
        startYear.setMinutes(0);
        startYear.setHours(0);
        startYear.setDate(1);
        startYear.setMonth(0);

        Date neededDate = new Date(date);

        long distance = neededDate.getTime()- startYear.getTime();

        long msDelay = 24*60*60*1000;

        int dayCount = (int) (distance/msDelay);

        if(dayCount%2==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
