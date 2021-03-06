package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("a", 2 ,2, 2);
        Cat cat2 = new Cat("b", 3 ,5, 10);
        Cat cat3 = new Cat("c", 4 ,2, 2);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
        System.out.println(cat3.fight(cat2));



    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;


        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;


        }
    }
}
