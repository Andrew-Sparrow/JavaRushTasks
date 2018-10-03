package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        HashMap<Integer, String> hashMap = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            String int1 = reader.readLine();

            if( int1.isEmpty())
            {
                break;
            }
            int id = Integer.parseInt(int1);

            String name = reader.readLine();

            if(name.isEmpty())
            {
                break;
            }

            hashMap.put(id, name);
        }
    
        for (Map.Entry<Integer, String> pair: hashMap.entrySet())
        {
            int id2 = pair.getKey();
            String name2 = pair.getValue();

            System.out.println("Id=" + id2 + " Name=" + name2);
        }
    }
}
