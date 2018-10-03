package com.javarush.task.task13.task1303;

/* 
Пиво с колой не мешать
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink)
    {
        System.out.println(drink.getClass().getSimpleName()+ " " + drink.isAlcoholic());
    }

    public interface Drink
    {
        String isAlcoholic();
    }

    public static class Beer implements Drink
    {
        @Override
        public String isAlcoholic()
        {
            return "- алк";
        }
    }

    public static class Cola implements Drink
    {
        @Override
        public String isAlcoholic()
        {
            return "- безалк";
        }
    }
}
