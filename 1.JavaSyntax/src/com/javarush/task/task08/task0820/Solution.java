package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        System.out.println("After removing ---------------------");
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код

        result.add(new Cat("Barsik"));
        result.add(new Cat("Winchester"));
        result.add(new Cat("Tomahawk"));
        result.add(new Cat("Abrams"));

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код


        HashSet<Dog> dog_result = new HashSet<>();

        dog_result.add(new Dog("White"));
        dog_result.add(new Dog("Green"));
        dog_result.add(new Dog("Brown"));

        return dog_result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код

        HashSet<Object> pets = new HashSet<>();

        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
    
        for (  Object obj:   pets)
        {
            System.out.println(obj);
        }
    }

    //напишите тут ваш код

    public  static class Cat {

        String name;

        Cat(String name){
            this.name = name ;
        }
        @Override
        public String toString(){
            return name ;
        }
    }

    public static class Dog {

        String name;

        Dog(String name){
            this.name = name ;
        }
        @Override
        public String toString(){
            return name ;
        }
    }

}
