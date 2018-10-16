package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
    
        Collection<Double>  collection = map.values();
    
        Double maxValue = Collections.max(collection);
       
        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
    
        while (iterator.hasNext())
        {
            Map.Entry<String, Double> pair = iterator.next();
        
            String key  = pair.getKey();
            Double value = pair.getValue();
            
            if(maxValue.equals(value))
            {
                System.out.println(key );
            }
        }
    }
}
