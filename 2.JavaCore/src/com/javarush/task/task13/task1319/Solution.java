package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:/1.txt"));

        while (true){

            String s = bufferedReader.readLine();

            bufferedWriter.write(s);

            bufferedWriter.newLine();

            if(s.equals("exit"))
                break;
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
