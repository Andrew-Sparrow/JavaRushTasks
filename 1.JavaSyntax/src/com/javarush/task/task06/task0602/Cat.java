package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) throws Throwable
    {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.finalize();
        dog.finalize();

    }

    //напишите тут ваш код


    protected void finalize() throws Throwable{
            System.out.println( " Cat was destroyed");
        }

}

class Dog {
    //напишите тут ваш код


    protected void finalize () throws Throwable{
        System.out.println(  " Dog was destroyed");
    }
}
