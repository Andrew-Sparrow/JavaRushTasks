package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;

        int cycle = 0;

        while (cycle <3)
        {
            if (Integer.parseInt(reader.readLine())>0)
            {
                i++;
            }

            cycle++;
        }
        System.out.println(i);

    }
}
