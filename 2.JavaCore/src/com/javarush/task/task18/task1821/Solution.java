package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream ;
import java.util.*;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader(args[0]);
        
        String fileName = args[0];
        
        Map<Character, Integer> map = new TreeMap<>();
        
        int count = 1 ;

        int data ;

        while(( data = fileReader.read()) != -1)
        {
            Character ch = (char)data;
            
            if(map.containsKey(ch))
            {
              int num = map.get(ch);
              
              ++num;
            
              map.put(ch, num);
            }
            else
            {
                map.put(ch, count);
            }
        }
        
        fileReader.close();
        
        for (Map.Entry<Character, Integer> pair : map.entrySet())
        {
            Character key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            System.out.println(key + " " + value);
        }
        
    }
}
