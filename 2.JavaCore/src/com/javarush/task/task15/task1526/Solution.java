package com.javarush.task.task15.task1526;

/* 
Дебаг, дебаг, и еще раз дебаг
*/

public class Solution
{
    public static void main(String[] args)
    {
        new B(6);
    }

    public static class A
    {
        public int fa = 7;

        public A(int f1)
        {
            this.fa = f1;
            this.initialize();
        }

        protected void initialize()
        {
            System.out.println(fa);
        }
    }

    public static class B extends A
    {
        protected int fb = 3;

        public B(int f1)
        {
            super(f1);
            this.fb += f1;
            initialize();
        }

        protected void initialize()
        {
            System.out.println(fb);
        }
    }
}
