package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        Map<String,String> map = new HashMap<>();

        map.put("Homykov", "Jon");
        map.put("Ivanova", "Friza");
        map.put("Zaycev", "Jon");
        map.put("Krolikov", "Siu");
        map.put("Diatlovov", "Jon");

        return (HashMap<String, String>) map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код


        Collection<String> col =  map.values();

        ArrayList<String> array_Values = new ArrayList(col);

        HashMap<String,Integer> dublicates= new HashMap<>();

        /*for (String str :  array_Values   ) // find out dublicates and add them to map("dublicates") and increase value by 1.
        {
            if(dublicates.containsKey(str))
            {
                dublicates.put(str, dublicates.get(str)+1);
            }
            else {
                dublicates.put(str, 1) ;
            }
        }
    
        for ( Map.Entry<String, Integer> pair : dublicates.entrySet() )
        {
            if(pair.getValue()>1)
            {
                removeItemFromMapByValue(map, pair.getKey());

            }
        }*/

        HashMap<String, String> copy = new HashMap<String, String>(map); // second variant with method "frequency"

        for ( Map.Entry<String, String> pair : copy.entrySet() )
        {
            if (Collections.frequency(col, pair.getValue())>1)
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {

            if (pair.getValue().equals(value))
            {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {


        HashMap<String,String> map = new HashMap<>();

        map.put("Homykov", "Jon");
        map.put("Ivanova", "Friza");
        map.put("Zaycev", "Jon");
        map.put("Krolikov", "Siu");
        map.put("Diatlovov", "Jon");

        removeTheFirstNameDuplicates(map);

        System.out.println(map);



    }
}
