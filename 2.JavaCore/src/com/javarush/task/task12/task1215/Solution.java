package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!

Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.

Требования:
1. Класс Pet должен быть абстрактным.
2. Класс Dog не должен быть абстрактным.
3. Класс Cat не должен быть абстрактным.
4. Класс Dog должен реализовать абстрактные методы из класса Animal.
5. Класс Cat должен реализовать абстрактные методы из класса Animal.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pet cat2 = new Cat();
        cat2.getChild();
    }

    public static abstract class Pet
    {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet
    {
        public String getName()
        {
            return null;
        }
        public Pet getChild()
        {
            Pet cat2 = new Cat();
            System.out.println(cat2+ "2hhh");
            return cat2;
        }

    }

    public static class Dog extends Pet
    {
        public String getName()
        {

            return null;
        }
        public Pet getChild()
        {

            return null;
        }

    }

}


