package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution
{
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args)
    {
        System.out.println(lines);
    }

    static
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));

            String line;

            while ((line = reader.readLine()) != null)
            {
                lines.add(line);
            }
            reader.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
