package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution
{
    static int count = 5;

    public static void main(String[] args) throws InterruptedException
    {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();

        for (int i = 0; i < count; i++)
        {
            //tt.printMsg();
            System.err.println("in main - "+ i+" " + Thread.currentThread().getName());
            Thread.sleep(2);
        }
    }

    public static class NameOfDifferentThreads extends Thread
    {
        public void run()
        {
            for (int i = 0; i < count; i++)
            {
                try
                {
                    printMsg();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException
        {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.err.println("name=" + name);
            //add sleep here - добавь sleep тут
            Thread.sleep(2);
        }
    }
}
