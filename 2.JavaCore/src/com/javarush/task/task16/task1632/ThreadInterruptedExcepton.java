package com.javarush.task.task16.task1632;

/**
 * Created by Администратор on 02.07.2018.
 */
public class ThreadInterruptedExcepton extends Thread
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000000);
        }
        catch (InterruptedException e)
        {
            System.out.println("InterruptedException");
        }
    }
}
