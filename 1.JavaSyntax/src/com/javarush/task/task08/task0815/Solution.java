package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        Map<String,String> map = new HashMap<>();

        map.put("Ivanov", "Jonson");
        map.put("Homykov", "Jon");
        map.put("Ivanov", "Friz");
        map.put("Zaycev", "Jon");
        map.put("Krolikov", "Siu");

        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код

        int count_FirstName =0;

        for ( String s : map.values() )
        {
            if(s.equals(name)){

            count_FirstName++;
            }

        }
        return count_FirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count_lastName = 0;

        for ( String s : map.keySet()  )
        {
            if(s.equals(lastName))
            {
                count_lastName++;
            }
        }
        return count_lastName;
    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameLastName(createMap(), "Ivanov")  );
        System.out.println(getCountTheSameFirstName(createMap(), "Jon")  );

    }
}
