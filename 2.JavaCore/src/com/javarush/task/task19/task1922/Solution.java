package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String fileName = /*bufferedReader.readLine()*/ "F:/1.txt";
    
        //bufferedReader.close();
    
        FileReader fileReader = new FileReader(fileName);
    
        StringBuilder stringBuilder = new StringBuilder();
    
        //adding lines from file to stringBuilder
        while (fileReader.ready())
        {
            Character character = (char) fileReader.read();
        
            stringBuilder.append(character);
        }
        fileReader.close();
    
        String str = stringBuilder.toString();
        String[] arrLines = str.split("\n"); //split string by newLine
    
        /*for (String s: arrLines)
        {
            System.out.println(s);
        }*/
        for ( String strArrLines: arrLines )
        {
            int count = 0;
            String[] arrSplitted = strArrLines.split(" ");
        
            for ( String strWords: words)
            {
                for ( String strArrSplitted: arrSplitted)
                {
                    if(strWords.equals(strArrSplitted))
                        ++count;
                }
            }
            System.out.println(count);
        }
    }
}
