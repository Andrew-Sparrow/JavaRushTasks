package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String valueOfArg = args[0];
        String fileName = args[1];/*"F:/1.txt";*/
        String fileOutputName = args[2];/*"F:/2.txt";*/
    
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        
        if("-e".equals(valueOfArg))
        {
            while(fileInputStream.available()>0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data + 1);
            }
        }
        else if("-d".equals(valueOfArg))
        {
            while(fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data - 1);
        
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
