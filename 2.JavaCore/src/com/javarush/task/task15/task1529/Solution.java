package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution
{
    public static void main(String[] args)
    {

    }
    static
    {
        //add your code here - добавьте код тут

        try
        {
            reset() ;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static Flyable result;



    public static void reset() throws IOException
    {
        //add your code here - добавьте код тут

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String s = bufferedReader.readLine();

            if("helicopter".equals(s))
            {
                result = new Helicopter();
            }
            else if("plane".equals(s))
            {
                String sInt =bufferedReader.readLine();
                int numPassengers = Integer.parseInt(sInt);
                result = new Plane(numPassengers);

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        bufferedReader.close();
    }
}
