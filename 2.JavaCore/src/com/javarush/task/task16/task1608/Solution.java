package com.javarush.task.task16.task1608;

/* 
Продвижение на политических дебатах
*/

public class Solution
{
    public static int totalCountSpeeches = 200;
    public static int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException
    {
        Politician ivanov = new Politician("Иванов");
        ivanov.join();
        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");

        while (ivanov.getCountSpeeches() + petrov.getCountSpeeches() + sidorov.getCountSpeeches() < totalCountSpeeches)
        {
        }

        if(ivanov.getCountSpeeches() + petrov.getCountSpeeches() + sidorov.getCountSpeeches() >= totalCountSpeeches)
        {
            ivanov.interrupt();
            petrov.interrupt();
            sidorov.interrupt();
        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);

        Thread main = Thread.currentThread();
        main.sleep(500);

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);

        main.sleep(1000);

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread
    {
        private volatile int countSounds;

        public Politician(String name)
        {
            super(name);
            start();
        }

        public void run()
        {
            while (countSounds < totalCountSpeeches * soundsInOneSpeech)
            {
                countSounds++;
            }
        }

        public int getCountSpeeches()
        {
            return countSounds / soundsInOneSpeech;
        }

        @Override
        public String toString()
        {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeeches());
        }
    }
}

