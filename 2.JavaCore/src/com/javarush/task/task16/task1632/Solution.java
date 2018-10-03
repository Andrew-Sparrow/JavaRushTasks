package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;


public class Solution
{
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new ThreadInfinit());
        threads.add(new ThreadInterruptedExcepton());
        threads.add(new ThreadHooray());
        threads.add(new ThreadMessage());
        threads.add(new ThreadSum());
    }

    public static void main(String[] args) throws InterruptedException
    {

    }
}