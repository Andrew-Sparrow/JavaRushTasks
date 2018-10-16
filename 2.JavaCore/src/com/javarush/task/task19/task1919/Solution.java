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
        try
        {
            String fileName = args[0];
        
            File fileRead = new File(fileName);
        
            FileReader fileReader = new FileReader(fileRead);
        
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        
            Map<String, Double> map = new TreeMap<>();
        
            while(bufferedReader.ready())
            {
                String s = bufferedReader.readLine();
                
                String[] strArr = s.split(" ");
                
                String key = strArr[0];
                Double dblValue = Double.parseDouble(strArr[1]);
                
                if(map.containsKey(strArr[0]))
                {
                    map.replace(key, map.get(key), map.get(key) + dblValue);
                }
                else
                    map.put(key,dblValue );
            }
            
            Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
            
            while (iterator.hasNext())
            {
                Map.Entry<String, Double> pair = iterator.next();
        
                String key  = pair.getKey();
                Double value = pair.getValue();
        
                System.out.println(key + " " + value);
            }
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
