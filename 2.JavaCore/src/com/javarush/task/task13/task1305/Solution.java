package com.javarush.task.task13.task1305;

/* 
Четыре ошибки
*/

//import static com.javarush.task.task13.task1305.Solution.Hobbie.HOBBIE;

public class Solution {

    public static void main(String[] args) throws Exception {

        System.out.println( Dream.HOBBIE);
        System.out.println(new Hobbie());

    }

    interface Desire {
    }

    interface Dream {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Dream , Desire{

        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
