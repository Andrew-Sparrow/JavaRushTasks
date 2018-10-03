package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Malkovich", 100);
        map.put("Sidorovich", 600);
        map.put("Popovich", 100);
        map.put("Zabocovich", 700);
        map.put("Radjicovich", 100);

        return map ;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<>(map);
    
        for ( Map.Entry<String, Integer> pair: copy.entrySet() )
        {
            if(pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Malkovich", 100);
        map.put("Sidorovich", 600);
        map.put("Popovich", 100);
        map.put("Zabocovich", 700);
        map.put("Radjicovich", 100);

        removeItemFromMap(map);

        System.out.println(map);
    }
}