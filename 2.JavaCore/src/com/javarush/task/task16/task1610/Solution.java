package com.javarush.task.task16.task1610;

/* 
Расставь вызовы методов join()
*/


public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        Cat cat1 = new Cat("Мурка");

        Cat cat2 = new Cat("Пушинка");

//        cat1.join();
//        cat2.join();


    }

    private static void investigateWorld() throws InterruptedException
    {
        //Thread thread = Thread.currentThread();
        Thread.sleep(200);
    }

    public static class Cat extends Thread
    {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) throws InterruptedException
        {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }

        public void run()
        {
            System.err.println(getName() + " родила 2 котенка");
            try
            {
                initAllKitten();
            }
            catch (InterruptedException e)
            {
            }
            System.err.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKitten() throws InterruptedException
        {
            kitten1.start();
            kitten2.start();

            kitten1.join();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread
    {
        public Kitten(String name) throws InterruptedException
        {
            super(name);
            //join();
        }

        public void run()
        {
            System.err.println(getName() + ", вылез из корзинки");
            try
            {
                investigateWorld();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
