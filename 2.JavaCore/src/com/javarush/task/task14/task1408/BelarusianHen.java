package com.javarush.task.task14.task1408;

/**
 * Created by Администратор on 04.06.2017.
 */
public class BelarusianHen extends Hen
{
    //BelarusianHen belarusianHen = new BelarusianHen();

    @Override
     int getCountOfEggsPerMonth()
    {
        return 1;
    }
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + "." + " Я несу " + getCountOfEggsPerMonth() +  " яиц в месяц." ;
    }
}
