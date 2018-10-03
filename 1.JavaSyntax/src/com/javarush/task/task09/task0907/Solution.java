package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
        //напишите тут ваш код

         int a = 42 / 0;

        //напишите тут ваш код
        

            System.err.print(" 0");
            if (true)
            {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        }
        catch (ArithmeticException e){

            System.err.println("ArithmeticException");
        }
        catch (RuntimeException e)
        { // перехватили RuntimeException
            System.err.print(" 2");
            if (true)
            {
                throw e;
            }       // и бросили ВТОРОЙ раз ЕГО ЖЕ
        }
        System.err.println(" 3");
    }
}
