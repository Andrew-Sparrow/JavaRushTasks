package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;

        for(;true;)
        {
            String s = reader.readLine();
            int i = Integer.parseInt(s);

            if(i!= -1)
                sum =sum + i;
            else
                break;
        }
        System.out.println(sum);
    }
}
