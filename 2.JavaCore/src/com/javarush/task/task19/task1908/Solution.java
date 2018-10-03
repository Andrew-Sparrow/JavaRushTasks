package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String fileName1 =  /*"C:/1.txt";*/  bufferedReader.readLine();
        String fileName2 =  /*"D:/2.txt";*/  bufferedReader.readLine();
    
        bufferedReader.close();
        
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(fileName1));
    
        StringBuilder concatStr = new StringBuilder() ;
        
        
        
        while(bufferedReaderFile.ready())
        {
            concatStr.append(bufferedReaderFile.readLine());
        }
        
        String patternString1 = "(\\b(\\d+)\\b)";
        
        Pattern p = Pattern.compile(patternString1);
        Matcher m = p.matcher(concatStr);
    
        StringBuilder summaryStr = new StringBuilder() ;
    
        while (m.find())
        {
            summaryStr = summaryStr.append(m.group(1) + " ");
        }
    
        String strTrimmed = new String(summaryStr).trim();
    
        //System.out.println(strTrimmed);
        
        bufferedReaderFile.close();
    
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        
        bufferedWriter.write(strTrimmed, 0, strTrimmed.length());
        
        bufferedWriter.flush();
        bufferedWriter.close();
        
        
    }
}
