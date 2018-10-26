package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileRead = args[0];
        String fileWrite = args[1];
    
        FileReader fileReader = new FileReader(fileRead);
        FileWriter fileWriter = new FileWriter(fileWrite);
    
        String str = new String();
        
        while(fileReader.ready())
        {
            str = str +((char)fileReader.read());
        }
        
        String[] splittedArr = str.split("\\s|\\n ");
        
        StringBuilder newStrWSBuilder = new StringBuilder();
        //adding to new string needed words(which suitable for our conditions)
        for (int i = 0; i < splittedArr.length; i++)
        {
            String s = splittedArr[i];
            
            if(s.length() > 6 )
            {
                newStrWSBuilder = newStrWSBuilder.append(splittedArr[i] + " ");
            }
        }
        
        String strSpace = new String(newStrWSBuilder);
        
        // new partitioning of previous string to array, for adding there commas insteadof whitespace
        String[] splittedArrSorted = strSpace.split(" ");
    
        StringBuilder newStrCommaBuilder = new StringBuilder();
        
        //creating new string with commas
        for (int i = 0; i < splittedArrSorted.length; i++)
        {
            String s = splittedArrSorted[i];
        
            if(i != splittedArrSorted.length -1)
            {
                if (s.length() > 6)
                    newStrCommaBuilder = newStrCommaBuilder.append(splittedArrSorted[i] + ",");
            }
            else
                newStrCommaBuilder = newStrCommaBuilder.append(splittedArrSorted[i]);
        }
        
        
        String newStrFromBuilder = new String(newStrCommaBuilder);
        System.out.println(newStrFromBuilder);
        
        
        fileWriter.write(newStrFromBuilder);
        
        fileReader.close();
        fileWriter.close();
    
    }
}
