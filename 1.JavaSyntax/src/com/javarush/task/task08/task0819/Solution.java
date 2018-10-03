package com.javarush.task.task08.task0819;

import java.util.*;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        ArrayList<Cat> arr_cat = new ArrayList<>(cats); // copy of set

        System.out.println(arr_cat);

        printCats(cats);
       // cats.remove(arr_cat.get(1)); // delete necessary cat
       //or - cats.remove(cats.iterator().next());

        printCats(cats);

        System.out.println(cats.iterator().next()==arr_cat.get(0));

        arr_cat.set(1, new Cat("qwert"));

        printCats(cats);
        System.out.println(arr_cat);

    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        
        HashSet<Cat> set = new HashSet<>();

        set.add(new Cat("Мурка"));
        set.add(new Cat("Чижик"));
        set.add(new Cat("Кекс"));
        
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

            System.out.println(cats);
    }

    // step 1 - пункт 1
    
    public static class Cat {
        String name;
        
        Cat(String name) {
            this.name = name ;
            }

        public String toString(){
            return name ;
        }
    }



}
