package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв

Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9

*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc      = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();// сделали из алфавита массив
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        // ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
            
        }
       
        
        StringBuffer allStrings = new StringBuffer();
        
        for(int i = 0; i < list.size(); i++)  // объединение всех введенных строк в одну строку
        {
         allStrings = allStrings.append(list.get(i));
        }
        
        
        // напишите тут ваш код
        int count = 0;
        for(int a=0; a<alphabet.size(); a++)
        {
            for (int i = 0; i < allStrings.length(); i++)
            {
                if (allStrings.charAt(i) == alphabet.get(a))
                {
                    count++;
                }
        
            }
        String abcPlusNum = alphabet.get(a) + " " + count + "";
        System.out.println(abcPlusNum);
        count =0;
        }
      
        
    }

}
