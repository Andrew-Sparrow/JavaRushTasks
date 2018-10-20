package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
         String fileNameRead = args[0];
         
         String fileNameWrite = args[1]; ;
         
         FileReader fileReader = new FileReader(fileNameRead);
         
         FileWriter fileWriter = new FileWriter(fileNameWrite);
         
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         
         while (bufferedReader.ready())
         {
            String str = bufferedReader.readLine();
            
            String[] splittedStr = str.split(" ");
    
            for (int i = 0; i < splittedStr.length; i++)
            {
                String s = splittedStr[i];
        
                if(s.matches("(.*\\d.*)"))
                {
                     fileWriter.write(s+" ");
                }
            }
         }
         
         fileReader.close();
         fileWriter.close();
         bufferedReader.close();
    }
}
