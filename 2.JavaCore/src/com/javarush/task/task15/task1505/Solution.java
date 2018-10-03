package com.javarush.task.task15.task1505;

import java.util.ArrayList;
import java.util.List;

/* 
ООП - исправь ошибки в наследовании
*/

public class Solution
{
    public static interface Alive
    {
        Object containsBones();
    }

    public static class BodyPart implements Alive
    {
        private String name;
        protected Object o;


        public BodyPart(String name)
        {
            this.name = name;
        }


        public Object containsBones()
        {
            return "Yes";
        }

        public String toString()
        {
            return (containsBones() == "Yes") ? name + " содержит кости" : name + " не содержит кости";
        }
    }

    public static class Finger extends BodyPart
    {
        private boolean isArtificial;

        public Finger(String name,   boolean isArtificial)
        {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones()
        {
            return super.containsBones()== "Yes" & !isArtificial ? "Yes": "No";
        }
    }

    public static void main(String[] args)
    {
        printlnFingers();
        printlnBodyParts();
        printlnAlives();

        Object o = 123;  //o хранит Integer
        String s = o.toString();   //(String) o;
        System.out.println(s);
        int i = Integer.valueOf(s);
        System.out.println(i);

        long a=3;
        a = 5+'A'+a;
        long b = 'A';
        System.out.println(b);
        System.out.println(a);
        //System.out.println("a="+Math.round(a/2F));

        System.out.println((byte)383);
        System.out.println((byte)384);
        System.out.println((byte) - 384);

        Object w = get(4);
        System.out.println(w.getClass().getSimpleName());

        System.out.println(get(4));

        int i3= 1;
        double d2=i3/2.;
        String s2 ="text";
        System.out.println(("i="+i3+", d = "+d2+", s="+s2));
    }

    private static long get(int i)
    {
        return 5;
    }







    private static void printlnAlives()
    {
        System.out.println(new BodyPart("Рука").containsBones());
    }

    private static void printlnBodyParts()
    {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);

        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));

        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers()
    {
        List<Finger> fingers = new ArrayList<Finger>(5);

        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));

        System.out.println(fingers.toString());
    }
}

