package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();

        String s2 = reader.readLine();

        int i2 = Integer.parseInt(s2);

        if (i2 < 18)
        {
            System.out.println("Подрасти еще");
        }

    }
}
