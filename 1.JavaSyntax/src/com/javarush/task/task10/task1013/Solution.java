package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }
    
    public static class Human
    {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String colourSkin;
        private int high;
        private boolean sex;
        private String hair;
        
        public Human(int age)//1
        {
            
            this.age = age;
        }
        public Human(String name)//2
        {
            this.name = name;
        }
        public Human(String name, int age)//3
        {
            this.name = name;
            this.age = age;
        }
        public Human(String name, String colourSkin)//4
        {
            this.name = name;
            this.colourSkin = colourSkin;
        }
        public Human(String name, int age, String colourSkin)//5
        {
            this.name = name;
            this.colourSkin = colourSkin;
            this.age = age;
        }
        public Human(boolean sex)//6
        {
        this.sex =sex;
        }
        public Human(int age , int high)//7
        {
        this.age =age;
        this.high =high;
        }
        public Human(String name, String colourSkin, boolean sex)//8
        {
            this.name = name;
            this.colourSkin = colourSkin;
            this.sex = sex;
        }
        public Human(boolean sex ,String name, String colourSkin )//9
        {
            this.name = name;
            this.colourSkin = colourSkin;
            this.sex = sex;
        }
        
        public Human(String hair,  String colourSkin, int age)//10
        {
            this.hair = hair;
            this.colourSkin = colourSkin;
            this.age = age;
        }
    
        public String getName()
        {
            return name;
        }
    
        public int getAge()
        {
            return age;
        }
    
        public String getColourSkin()
        {
            return colourSkin;
        }
    
        public int getHigh()
        {
            return high;
        }
    
        public boolean isSex()
        {
            return sex;
        }
    
        public String getHair()
        {
            return hair;
        }
    }
   
}
