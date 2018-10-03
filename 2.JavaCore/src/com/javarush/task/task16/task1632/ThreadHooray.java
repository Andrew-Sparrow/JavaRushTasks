package com.javarush.task.task16.task1632;

/**
 * Created by Администратор on 02.07.2018.
 */
public class ThreadHooray extends Thread
{
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Ура");
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
