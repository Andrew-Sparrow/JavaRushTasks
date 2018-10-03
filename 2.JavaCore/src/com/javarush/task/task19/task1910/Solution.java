package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


         String fileIn =  bufferedReader.readLine();
         String fileOut = bufferedReader.readLine();

         bufferedReader.close();

//        String fileIn = "F:/JavaRush_tasks/task1825/file1.txt";
//        String fileOut= "F:/JavaRush_tasks/task1825/file2.txt";

        BufferedReader inStream = new BufferedReader(new FileReader(fileIn));

        BufferedWriter outStream = new BufferedWriter(new FileWriter(fileOut));

        while (inStream.ready())
        {
            Character ch = (char)inStream.read();

            Pattern p = Pattern.compile("\\p{Punct}|\r|\n");
            Matcher m = p.matcher(new String(ch.toString()));
            boolean b = m.matches();

            if(!b)
            {
                outStream.write(ch);
            }

        }

        inStream.close();
        outStream.close();

    }
}
