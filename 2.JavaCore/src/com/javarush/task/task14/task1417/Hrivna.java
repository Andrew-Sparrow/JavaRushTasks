package com.javarush.task.task14.task1417;

/**
 * Created by Администратор on 11.06.2017.
 */
public class Hrivna extends  Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }



    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
