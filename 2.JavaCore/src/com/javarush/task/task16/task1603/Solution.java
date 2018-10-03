package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution
{
    public static volatile List<Thread> list = new ArrayList<Thread>(3);

    public static void main(String[] args)
    {
        //Add your code here - добавьте свой код тут

        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();

        list.add(new Thread( specialThread1));
        list.add(new Thread( specialThread2));
        list.add(new Thread( specialThread3));
    
        for ( Thread spt :  list)
        {
            spt.start();
        }
    }

    public static class SpecialThread implements Runnable
    {
        static int i; //calculating new objects
        int objCounter ;

        SpecialThread()
        {
            i++;
            objCounter = i;
        }

        public String toString()
        {
            return "new SpecialThread " + objCounter;
        }

        public void run()
        {
            System.err.println("it's a run method inside SpecialThread " + this);
        }
    }
}
