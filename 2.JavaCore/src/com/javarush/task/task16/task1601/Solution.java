package com.javarush.task.task16.task1601;

/* 
My first thread
*/

public class Solution
{
    public static void main(String[] args)
    {
        TestThread task = new TestThread();

        new Thread(task).start();

        System.err.println("main");

        for (int i = 0; i < 500; i++)
        {
            System.err.println("thread in main");
        }

    }
    public static  class TestThread implements Runnable
    {
        @Override
        public void run()
        {
            for (int i = 0; i < 500; i++)
            {
                System.err.println("My first thread - in TestThread");
            }

        }
    }
}
