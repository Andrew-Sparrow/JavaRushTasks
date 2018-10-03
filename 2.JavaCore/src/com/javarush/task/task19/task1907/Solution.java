package com.javarush.task.task19.task1907;

import java.util.regex.*;
import java.io.*;

/*
Считаем слово
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName =  /*"C:/1.txt";*/ bufferedReader.readLine();
        
        bufferedReader.close();
    
        FileInputStream fileInputStream = new FileInputStream(fileName);
    
        int countOfBytes = fileInputStream.available();
    
        fileInputStream.close();
    
        char[] arr = new char[countOfBytes];
    
        FileReader fileReader = new FileReader(fileName);
    
        int index = 0;
    
        while(fileReader.ready())
        {
            arr[index] = (char)fileReader.read();
            index++;
        }
        String strFile = new String(arr);
       
        int count = 0;
        
        String patternString1 = "(\\bworld\\b)";
    
        Pattern p = Pattern.compile(patternString1);
        Matcher m = p.matcher(strFile);
        
    
        while (m.find())
        {
            count++;
        }
        System.out.println( count);
    
        fileReader.close();
        
    }
}
