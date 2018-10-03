package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);

        byte[] bufferForFileName1 = new byte[fileInputStream1.available()];

        File file = new File(fileName1);

        while (fileInputStream1.available() > 0)
        {
            fileInputStream1.read(bufferForFileName1);
        }

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        byte[] bufferForFileName2 = new byte[fileInputStream2.available()];

        while (fileInputStream2.available()>0)
        {
            int count = fileInputStream2.read(bufferForFileName2);

            fileOutputStream1.write(bufferForFileName1);
        }

        fileOutputStream1 = new FileOutputStream (file, true);








    }
}
