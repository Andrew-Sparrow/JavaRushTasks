package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat duc1 = new Cat();
        Cat duc2 = new Cat();
        System.out.println(duc1);
        System.out.println(duc2);

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        System.out.println(d1);
        System.out.println(d2);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
    public static class Cat {
        public String toString() {
            return "Cat";
        }

    }
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}
