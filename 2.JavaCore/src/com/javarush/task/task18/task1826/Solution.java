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
        String fileName = "F:/1.txt";
        String fileOutputName = "F:/2.txt";
    
        System.out.println(args[1]);
        /*
        FileInputStream fileInputStream = new FileInputStream(fileOutputName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        
        
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
        }*/
    }
}
