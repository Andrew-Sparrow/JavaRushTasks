package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution
{
    public static List<String> words = new ArrayList<String>();
    
    static
    {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String fileName = bufferedReader.readLine() ; /*"F:/1.txt";*/
    
        bufferedReader.close();
    
        FileReader fileReader = new FileReader(fileName);
    
        StringBuilder stringBuilder = new StringBuilder();
    
        //adding lines from file to stringBuilder
        while (fileReader.ready())
        {
            Character character = (char) fileReader.read();
        
            stringBuilder.append(character);
        }
        fileReader.close();
    
        String str = new String(stringBuilder);
        
        String[] arrLines = str.split("\r\n"); //split string by newLine
    
    
        for ( String strArrLines: arrLines )
        {
            int count = 0;
            
            if (strArrLines == null || strArrLines.isEmpty())
            {
                count = 0;
            }
            else
            {
                String[] arrSplitted = strArrLines.split(" "); //splitting each line by whitespace
    
                // verify if each word from List-"words" equals each word from temporary "arrSplitted"
                for (String strWords : words)
                {
                    for (String strArrSplitted : arrSplitted)
                    {
                        if (strWords.equals(strArrSplitted))
                            ++count;
                    }
                }
                if (count == 2)
                {
                    System.out.println(strArrLines);
                }
            }
        }
    }
}
