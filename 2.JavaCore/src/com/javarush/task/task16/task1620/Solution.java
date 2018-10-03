package com.javarush.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/* 
Один для всех, все - для одного
*/

public class Solution
{
    public static byte countThreads = 3;
    static List<Thread> threads = new ArrayList<Thread>(countThreads);

    public static void main(String[] args) throws InterruptedException
    {
        initThreadsAndStart();
        Thread.sleep(2000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod()
    {
        //add your code here - добавь код тут

        for (Thread thread: threads)
        {
            thread.interrupt();
            System.out.println("нить "+ thread.getName()+" was interrupted" );
        }
    }

    private static void initThreadsAndStart()
    {
        Water water = new Water("water");

        for (int i = 0; i < countThreads; i++)
        {
            threads.add(new Thread(water, "#" + i)); // как получить имя runnable объекта из Thread,
            // т.е. значение - commonResource, из класса Water?
        }

        for (int i = 0; i < countThreads; i++)
        {
            threads.get(i).start();
        }
    }
    /*private static void getCommonResource()
    {
        System.out.println(Water.commonResource);
    }*/

    public static class Water implements Runnable
    {
        public static String commonResource;
        boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();

        //public boolean isCurrentThreadInterrupted = false;

        public Water(String commonResource)
        {
            this.commonResource = commonResource;
        }

        public void run()
        {
            //fix 2 variables - исправь 2 переменных


            String threadName = Thread.currentThread().getName();

            try
            {
                while (!isCurrentThreadInterrupted)
                {
                    System.out.println("Объект " + commonResource + ", нить " + threadName);
                    Thread.sleep(500);

                }
            }
            catch (InterruptedException e)
            {
            }
        }

    }
}
