package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream ;
import java.io.IOException;
import  java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        reader.close();

        int fileSize = fileInputStream.available();

        if(fileInputStream.available() > 0)
        {

            if (fileSize % 2 == 0)
            {
                while (fileInputStream.available() > fileSize / 2)
                {
                    int data = fileInputStream.read();
                    outputStream1.write(data);
                }

                //outputStream1 = new FileOutputStream(newFile3);

                while (fileInputStream.available() <= fileSize / 2 && fileInputStream.available() > 0)
                {
                    int data = fileInputStream.read();
                    outputStream2.write(data);
                }
            }

            if (fileSize % 2 != 0)
            {
                while (fileInputStream.available() >= fileSize / 2 + 1)
                {
                    int data = fileInputStream.read();
                    outputStream1.write(data);
                }

                //outputStream1 = new FileOutputStream(newFile3);

                while (fileInputStream.available() <= fileSize / 2 && fileInputStream.available() > 0)
                {
                    int data = fileInputStream.read();
                    outputStream2.write(data);
                }
            }
        }
        fileInputStream.close();
        outputStream1.close();
        outputStream2.close();

    }

}
