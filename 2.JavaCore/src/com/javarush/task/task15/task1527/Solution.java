package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        //

        String s = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";

        int indQuestion= s.indexOf("?");
        int indEndString = s.length()-1;
        int indEqual = s.indexOf("=");

        int fromIndex = indQuestion+1 ;

        String subStringTillEnd = s.substring(fromIndex);



        for (int i = fromIndex+1; i < s.length(); i++)
        {
            if (subStringTillEnd.contains("&"))// if string have "&"
            {
                int indAnd = subStringTillEnd.indexOf("&");

                String subStringParamWithAnd = subStringTillEnd.substring(0, indAnd);// till next "&"

                if(subStringParamWithAnd.contains("="))
                {
                    String subStringParametr = s.substring(indQuestion+1, indEqual);

                    System.out.println(subStringParametr);
                }
                else
                {
                    System.out.println(subStringParamWithAnd);
                }

            }
            else // if string doesn't have "&"
            {
                String subStringParamWithEnd = s.substring(indQuestion+1, indEndString);

                if(subStringParamWithEnd.contains("="))
                {
                    String subStringWithoutEqual = s.substring(indQuestion+1, indEqual);
                    System.out.println(subStringWithoutEqual);
                }
                else // showed all string till end
                {
                    System.out.println(subStringParamWithEnd);
                }
            }
        }
    }


    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
