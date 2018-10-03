package com.javarush.task.task16.task1632;

/**
 * Created by Администратор on 02.07.2018.
 */
public class ThreadMessage extends Thread implements Message
{
    //public static volatile boolean stopIt = false ;


    @Override
    public void run()
    {
        while (!isInterrupted())
        {

        }
    }

    public void showWarning()
    {
        this.interrupt();
    }

}
