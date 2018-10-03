package com.javarush.task.task05.task0528;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

import javax.xml.crypto.Data;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        Date date = new Date();

        System.out.println(dateFormat.format(date));

        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));




    }
}
