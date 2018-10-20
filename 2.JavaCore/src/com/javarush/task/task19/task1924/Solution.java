package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Замена чисел
*/

public class Solution
{
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    
    static
    {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName = bufferedReader.readLine();     /*"F:/1.txt" ;*/
        
        bufferedReader.close();
        
    
        FileReader fileReader = new FileReader(fileName);
        
        StringBuilder stringBuilder = new StringBuilder();
        
        while(fileReader.ready())
        {
            stringBuilder.append((char) fileReader.read());
        }
        
        String newStr = stringBuilder.toString();
        
        Set<Map.Entry<Integer, String>> entrySet= map.entrySet();
    
        for (Map.Entry<Integer, String> pair : map.entrySet())
        {
            Integer key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            
            newStr = newStr.replaceAll("\\b" + key + "\\b",  value);
        }
        
        System.out.println(newStr);
        
        fileReader.close();
        
       
    }
}
