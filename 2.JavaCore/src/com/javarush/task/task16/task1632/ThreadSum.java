package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 02.07.2018.
 */
public class ThreadSum extends Thread
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String str;
    int sum;

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                str = reader.readLine();

                if(str.equals("N"))
                {
                    System.out.println(sum);
                    return;
                }

                sum = sum + Integer.parseInt(str);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
