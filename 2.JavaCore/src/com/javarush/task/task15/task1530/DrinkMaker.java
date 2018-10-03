package com.javarush.task.task15.task1530;

/**
 * Created by Администратор on 19.06.2018.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    void makeDrink()
    {
        getRightCup();

        putIngredient();

        pour();
    }

}
