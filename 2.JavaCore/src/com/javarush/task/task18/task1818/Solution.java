package com.javarush.task.task18.task1818;

/* 
Два в одном
*/
// дописать в файл

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);

        File file = new File(fileName1);


        byte[] buffer = new byte[1000];

        while (fileInputStream2.available() > 0)
        {
            int count = fileInputStream2.read(buffer);

            fileOutputStream.write(buffer, 0, count);
        }

        fileOutputStream = new FileOutputStream(file, true);

        while (fileInputStream3.available() > 0)
        {
            int count = fileInputStream3.read();

            fileOutputStream.write(count);
        }

        fileInputStream3.close();
        fileInputStream3.close();
        fileOutputStream.close();
    }
}
