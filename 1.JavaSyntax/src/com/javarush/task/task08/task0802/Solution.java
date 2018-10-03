package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        HashMap<String, String> map  = new HashMap<>();

        map.put("арбуз" , "ягода");
        map.put("ар" , "яг");
        map.put("ар44444444" , "яг44444");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();

            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key +"  "+ value);
        }




    }
}
