package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfatherName = reader.readLine();
        Cat gFather = new Cat(gfatherName);

        String gmotherName = reader.readLine();
        Cat gMother = new Cat(gmotherName);



        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, gFather);

        String matherName = reader.readLine();
        Cat mother = new Cat(matherName, gMother, null);



        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daugtherName = reader.readLine();
        Cat daugther = new Cat(daugtherName, mother, father);


        System.out.println(gFather);
        System.out.println(gMother);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(son);
        System.out.println(daugther);


    }

    public static class Cat {
        private String name;
        private Cat parent_father;
        private Cat parent_mother;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent_mother, Cat parent_father) {
            this.name = name;
            this.parent_mother = parent_mother;
            this.parent_father = parent_father ;
        }

        @Override
        public String toString() {
            if (parent_mother == null && parent_father == null)
                return "Cat name is " + name + ", no mother, no father";
            else if( parent_mother == null )
                return "Cat name is " + name + ", no mother,  father is " + parent_father.name;
            else
                return "Cat name is " + name + ", mother is " + parent_mother.name+ ", no father";

        }
    }

}
