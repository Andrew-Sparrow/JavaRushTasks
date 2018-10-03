package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        if (i1 != i2 && i1 != 13)
        {
            System.out.println("1");
        }
        else  if (i2 != i1 && i2 != 13)
        {
            System.out.println("2");
        }
        else if (i3 != i1 && i3 != 12)
        {
            System.out.println("3");
        }
    }
}
