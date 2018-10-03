package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man =new Man("qwe", 1, "adr");
        Woman woman =new Woman("qwe", 1, "adr");

        System.out.println(man);
    }

    //напишите тут ваш код
    public static class Man{
        String name ;
        int age ;
        String address ;

        public String toString() {

            return this.name+" "+ this.age+" " + this.address;
        }

        Man(){

        }


        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
