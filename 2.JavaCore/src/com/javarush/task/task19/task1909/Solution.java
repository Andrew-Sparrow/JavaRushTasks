package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String fileName1 = null;
        String fileName2 = null;
    
        try
        {
             fileName1 =  /*"C:/1.txt";*/  bufferedReader.readLine();
             fileName2 =  /*"D:/2.txt";*/ bufferedReader.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    
        bufferedReader.close();
    
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(fileName1));
    
        StringBuilder concatStr = new StringBuilder() ;
 
        while(bufferedReaderFile.ready())
        {
            concatStr.append((char)bufferedReaderFile.read()); //concat characters from file to new string
        }
        
        bufferedReaderFile.close();
        
        String patternString1 = "\\.";
    
        Pattern p = Pattern.compile(patternString1);
        Matcher m = p.matcher(concatStr);
        
        String resultStr = m.replaceAll("!"); // replace symbols in concatenated string
    
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
    
        bufferedWriter.write(String.valueOf(resultStr), 0, concatStr.length()); //write new string to file
    
        bufferedWriter.flush();
        bufferedWriter.close();
        
    }
}
