package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName = bufferedReader.readLine();
    
        bufferedReader.close();
    
        FileReader fileReader = new FileReader(fileName);
        
        BufferedReader bufferedReaderFile = new BufferedReader(fileReader);
        
        while (bufferedReaderFile.ready())
        {
            String str = bufferedReaderFile.readLine();
    
            char[] dst = new char[str.length()];
            
            str.getChars(0,str.length(),dst, 0);
            
            //reverse the string
            for(int i = 0; i < dst.length / 2; i++)
            {
                char temp = dst[i];
                dst[i] = dst[dst.length - i - 1];
                dst[dst.length - i - 1] = temp;
            }
            str = String.valueOf(dst);
            System.out.println(str);
        }
        
        fileReader.close();
        bufferedReaderFile.close();
        
        
    }
}
