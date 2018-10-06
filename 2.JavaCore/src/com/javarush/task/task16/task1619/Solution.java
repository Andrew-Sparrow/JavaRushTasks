package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution

{
    public static boolean stopIt = false ;

    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() throws InterruptedException
    {
        stopIt = true ;
    }

    public static class TestThread implements Runnable
    {
        public void run()
        {
            while (!stopIt)
            {
                try
                {
                    System.out.println("he-he");
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                }
            }
        }
    }
}