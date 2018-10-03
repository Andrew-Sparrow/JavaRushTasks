package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        String s4 = bufferedReader.readLine();

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        int i4 = Integer.parseInt(s4);

        if (i1 >= i2 && i1 >= i3 && i1 >= i4)
        {
            System.out.println(i1);
        }
        else
            if (i2 >= i1 && i2 >= i3 && i2 >= i4)
            {
                System.out.println(i2);
            }
            else
                if (i3 >= i2 && i3 >= i1 && i3 >= i4)
                {
                    System.out.println(i3);
                }
                else
                {
                    System.out.println(i4);
                }

    }
}
