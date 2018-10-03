package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        String s1 = reader.readLine();
        int i1 = Integer.parseInt(s1);

        while (i1>0)
        {
            System.out.println(s);
            i1--;
        }

    }
}
