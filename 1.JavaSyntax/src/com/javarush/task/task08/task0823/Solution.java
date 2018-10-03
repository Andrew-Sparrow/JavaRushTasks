package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = "мама мыла раму мылом."; //reader.readLine();

        String[] str_split = s.split(" ");

        String result ="";

        String result_trim ="";

        for ( String str :  str_split)
        {
            String str2 = str.substring(0,1).toUpperCase().concat(str.substring(1, str.length())); //taking first latter as substring and concatenate its with remainder

            result = result.concat(str2+" ");

            result_trim = result.trim();
        }

        System.out.println(result_trim);

        //напишите тут ваш код

    }
}
