package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

     /*   while (true)
        {
            //String s = reader.readLine();

            if (s.isEmpty())
            {
                break;
            }
        }*/

        list.add("Вишня");
        list.add("1");
        list.add("Боб");
        list.add("3");
        list.add("Яблоко");
        list.add("22");
        list.add("0");
        list.add("Арбуз");

        String[] array = list.toArray(new String[list.size()]);

        sort(array);



        for (String x : array)
        {
            System.out.println(x);
        }

        //System.out.println( isGreaterThan("1", "22"));
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
    
        for (int i = 0; i < array.length; i++) // sort numbers
        {

            if(isNumber(array[i])){

                int max = Integer.parseInt(array[i]);

                for (int j = i+1; j < array.length-1; j++)
                {
                    if(isNumber(array[j])){

                        int temp;

                        int second = Integer.parseInt(array[j]);

                        if( second > max){

                            temp = max;

                            max = second;
                            array[i] = second+"";

                            second = temp;
                            array[j] = second+"";
                        }
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) // sort words
        {

            if(!isNumber(array[i])){

                String min = array[i];

                for (int j = i+1; j < array.length-1; j++)
                {
                    if(!isNumber(array[j])){

                        String temp;

                        String second = array[j];

                        if( !isGreaterThan(min , second)){

                            temp = min;

                            min = second;
                            array[i] = second;

                            second = temp;
                            array[j] = second;
                        }
                    }
                }
            }
        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0)
        {
            return false;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
