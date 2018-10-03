package com.javarush.task.task16.task1611;

/* 
Часы
*/

import java.util.Date;

public class Solution
{
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException
    {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        //clock.join();
        System.err.println("Clock has to be stopped");
        Thread.sleep(1000);
        System.err.println("Double-check");
    }

    public static class Clock extends Thread
    {
        public Clock()
        {
            //setPriority(MAX_PRIORITY);
            start();
        }

        public void run()
        {
            try
            {
                while (!isStopped)
                {
                    printTikTak();
                }
            }
            catch (InterruptedException e)
            {
            }
        }
        private void printTikTak() throws InterruptedException
        {
           //add your code here - добавь код тут

                Thread.sleep(500);
                System.out.println("Tic");

                Thread.sleep(500);
                System.out.println("Tak");
        }
    }
}
