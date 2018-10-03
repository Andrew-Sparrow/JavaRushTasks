package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1= reader.readLine();
        int i1 = Integer.parseInt(s1);

        String s2= reader.readLine();
        int i2 = Integer.parseInt(s2);

        int sum = i1 + i2;
        System.out.println("Sum = " + sum);
    }
}
