package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0 ;

            for (;true;)
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                String s = reader.readLine();
                int i ;

                if(!(s.equals("сум")))
                {
                    i = Integer.parseInt(s);
                    sum = sum + i;
                    System.out.println(sum);
                }
                else
                {
                    System.out.println(sum);
                    break;
                }
            }

    }
}
