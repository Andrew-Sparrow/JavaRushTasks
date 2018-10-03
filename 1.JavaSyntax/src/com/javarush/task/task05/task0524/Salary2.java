package com.javarush.task.task05.task0524;

/**
 * Created by Администратор on 20.02.2018.
 */
public class Salary2
{
    int value = 1000;
    Salary2()
    {
    }
    Salary2(Salary2 obj)
    {
        obj.value = obj.value * 3;
    }
    public static void main(String args[])
    {

        int mark =100;


        if (mark > 80)
        {
            System.out.println("mark > 80");
        }
        else if (mark > 60)
        {
            System.out.println("mark > 60");
        }

        Salary2 s1 = new Salary2();
        Salary2 s2 = new Salary2(s1);

        System.out.println("s1.value=" +s1.value);
        System.out.println("s2.value="+s2.value);
    }
}
