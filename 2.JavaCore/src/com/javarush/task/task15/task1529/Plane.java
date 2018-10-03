package com.javarush.task.task15.task1529;

/**
 * Created by Администратор on 19.06.2018.
 */
public class Plane implements Flyable
{
    int i;

    Plane(int i)
    {
        this.i=i;
        System.out.println("Plane("+ i +")");
    }

    @Override
    public void fly()
    {

    }
}
