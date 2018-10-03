package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JANUARY 1 1980"));
        map.put("Shwarz", new Date("MARCH 1 1980"));
        map.put("Willis", new Date("JUNE 1 1980"));

        map.put("Dam", new Date("JULY 1 1980"));
        map.put("Lee", new Date("AUGUST 1 1980"));
        map.put("Lundgren", new Date("JUNE 1 1980"));

        map.put("Chan", new Date("JUNE 1 1980"));

        //напишите тут ваш код

        return map ;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        ArrayList<String> arrayList = new ArrayList();

        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            Calendar cal = Calendar.getInstance();

            Date date2 = pair.getValue();

            cal.setTime(date2);

            if(cal.get(Calendar.MONTH)==5 || cal.get(Calendar.MONTH)==6 || cal.get(Calendar.MONTH)==7){

                arrayList.add(pair.getKey());
            }
        }

        System.out.println(arrayList);
        
        for (String s: arrayList )
        {
            map.remove(s);
        }
    
        for (Map.Entry<String, Date> pair: map.entrySet()  )
        {
            System.out.println(pair);
        }
    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
