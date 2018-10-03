package com.javarush.task.task14.task1421;

/**
 * Created by Администратор on 19.06.2017.
 */
public class Cat
{
    protected String getName()
    {
        return "Васька";
    }

    public Cat parent;
    public Cat getMyParent()
    {
        return this.parent;
    }
    public void setMyParent(Cat cat)
    {
        this.parent = cat;
    }
}
