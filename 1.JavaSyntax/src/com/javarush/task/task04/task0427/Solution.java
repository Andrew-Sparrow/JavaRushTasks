package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();

        int a = Integer.parseInt(s1);

        if (a % 2 == 0)
        {
            System.out.print("четное ");
        }

        if (a > 0 && a < 10)
        {
            System.out.print("однозначное число");
        }

        else if (a > 9 && a < 100)
        {
            System.out.print("двузначное число");
        }
        else if (a > 99 && a < 1000)
        {
            System.out.print("трехзначное число");
        }

    }
}
