package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            throw  new IndexOutOfBoundsException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //ClassCastException
        {
            class TryClassCastException
            {

            }

            Object object = new Object();

            Object obj = (TryClassCastException) object;

        }
        catch (Exception e)
        {
            exceptions.add(e);
            System.out.println("ddddddddddddddddddddd");
        }

        try //nullpointerexception
        {
            String s = null;

            s.toLowerCase();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try //FileNotFoundException
        {
            File file = new File("E://file.txt");
            FileReader fileReader = new FileReader(file);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //NumberFormatException
        {
            Integer.parseInt("asdasd");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
