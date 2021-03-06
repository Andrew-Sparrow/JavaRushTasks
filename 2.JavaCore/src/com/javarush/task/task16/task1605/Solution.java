package com.javarush.task.task16.task1605;

import java.util.Date;

/* 
Поговорим о музыке
*/

public class Solution
{
    public static int delay = 1000;

    public static void main(String[] args)
    {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n)
    {
        try
        {
            Thread.sleep(n * delay);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable
    {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument
    {
        private String owner;

        public Violin(String owner)
        {
            this.owner = owner;
        }

        public Date startPlaying()
        {
            System.err.println(this.owner + " starts playing");
            return new Date();
        }

        public Date stopPlaying()
        {
            System.err.println(this.owner + " stops playing");
            return new Date();
        }

        @Override
        public void run()
        {
            Date dateStart = this.startPlaying();

            sleepNSeconds(1);

            Date dateStop = this.stopPlaying();

            long result = dateStop.getTime() - dateStart.getTime() ;

            System.err.println(result);
        }
    }
}
