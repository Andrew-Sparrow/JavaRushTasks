package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        
        String fileName = args[0];
    
        FileReader fileReader = new FileReader(fileName);
    
        Map<String, Double> map = new TreeMap<>();
        
        StringBuilder stringBuilder = new StringBuilder();
        
        //adding lines from file to stringBuilder
        while(fileReader.ready())
        {
           Character character = (char)fileReader.read();
           
           stringBuilder.append(character);
        }
        String str = stringBuilder.toString();
        String[] arrLines = str.split("\n"); //split string by newLine

        for (String s: arrLines)
        {
            String[] strArr = s.split(" "); // split string by whitespace

            String key = strArr[0];
            Double value = Double.parseDouble(strArr[1]);

            if(map.containsKey(strArr[0])) // putting substrings to map
            {
                map.replace(key, map.get(key), map.get(key) + value);
            }
            else
                map.put(key,value );
        }
        
        fileReader.close();
        
        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext())
        {
            Map.Entry<String, Double> pair = iterator.next();
    
            String key  = pair.getKey();
            Double value = pair.getValue();
    
            System.out.println(key + " " + value);
        }
    }
}
