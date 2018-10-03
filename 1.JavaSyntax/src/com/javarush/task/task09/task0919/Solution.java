package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        divisionByZero();
    }
    public static void  divisionByZero() throws ArithmeticException{

        int result = 0;

        try
        {
            result = 5/0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw  new ArithmeticException();
        }

        System.out.println(result);

    }
}
