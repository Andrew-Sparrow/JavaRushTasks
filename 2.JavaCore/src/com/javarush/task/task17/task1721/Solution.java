package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1_allLines = reader.readLine(); // read first name of file

        BufferedReader reader2 = new BufferedReader(new FileReader(s1_allLines));

        String line;

        while ((line = reader2.readLine()) != null) // it might be done like this- allLines=reader.lines().collect(Collectors.toList());
        {
            allLines.add(line);
        }

        reader2.close();

        System.out.println(allLines);


        //---------------------------
        String s2_forRemoveLines = reader.readLine(); //read second name of file

        BufferedReader reader3 = new BufferedReader(new FileReader(s2_forRemoveLines));

        String line2;

        while ((line2 = reader3.readLine()) != null)
        {
            forRemoveLines.add(line2);
        }

        reader.close();

        reader3.close();

        System.out.println( forRemoveLines);

        //-------------------------------------------

        Solution solution = new Solution();

        try
        {
            solution.joinData();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(allLines);
    }

    public void joinData() throws IOException
    {
        if(allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        }
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
