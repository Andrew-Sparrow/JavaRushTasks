package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код

        String s1= "c:/1.txt";

        InputStream inputStream = new FileInputStream(s1);

        while (inputStream.available() > 0){

            char data = (char) inputStream.read();

            System.out.print(data);
        }

        inputStream.close();
    }
}