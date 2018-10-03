package com.javarush.task.task08.task0809;

import java.util.*;
import java.lang.InterruptedException ;

/* 
Время для 10 тысяч вставок
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();

        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }

        else{
            System.out.println("time no end");
        }
    }

}
