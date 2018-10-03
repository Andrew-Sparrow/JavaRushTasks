package com.javarush.task.task10.task1016;

//import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/
/*
package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке

Ввести с клавиатуры в список 20 слов.
Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>,
где первый параметр – уникальная строка, а второй –
число, сколько раз данная строка встречалась в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/
/*
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>(); //список с внесенными словами

        for (int i = 0; i < 3; i++) //внесли слова в список
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);//вызываем метод с подсчитаннми словами и заносим его
        // в список с подсчитанным колич. слов

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) // метод подсчета слов
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код

/*  1 вариант решения
        Integer cnt;

        for (String s : list)
        {
            cnt = result.get(s);
            result.put(s, cnt == null ? 1 : cnt + 1);
        }
        */
/*  2 вариант решения
        for (String x:list)
        {
            int cnt = 0;

            for (String z:list)
            {
                if (z.equals(x))
                    cnt++;
            }
            result.put(x,cnt);

        }
*/
        // 3 вариант решения
/*        for(String s : list)
        {
            if(result.containsKey(s))
                result.put(s,result.get(s)+1);
            else
                result.put(s,1);
        }


        //4 вариант

        for(String s : list)
        {
            int count = Collections.frequency(list, s);
            result.put(s,count);
        }
        return result;
    }

}

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        //for (int i = 0; i < 20; i++) {
            words.add("стол");//reader.readLine());
            words.add("стол");//reader.readLine());
            words.add("стул");//reader.readLine());
            words.add("пол" );//reader.readLine());
            words.add("гол" );//reader.readLine());
            words.add("стол");//reader.readLine());
        //}

        LinkedHashMap <String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static LinkedHashMap <String, Integer> countWords(ArrayList<String> list) {

        LinkedHashMap <String, Integer> result = new LinkedHashMap <String, Integer>();

        //напишите тут ваш код

        /*int num = 0;

        int cnt = 0;
    
        for (int i = 0; i < list.size(); i++)
        {
            if(result.containsKey(list.get(i)))
                continue;

            for (int j = 0; j < list.size(); j++)
            {
                if(list.get(j)==list.get(i)){
                    num++;
                    result.put(list.get(i), num);
                }
                cnt = result.get("s");
            }
            num=0;
        }
        System.out.println(cnt == null ? 1);*/

        Integer cnt;

        for(String s : list)
        {
            int count = Collections.frequency(list, s);
            result.put(s,count);
        }
        return result;
    }
}

