package com.javarush.task.task12.task1207;

/* 
Int и Integer

Int и Integer
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.


Требования:
1. Класс Solution должен содержать статический метод main().
2. Класс Solution должен содержать статический метод print() с параметром типа int.
3. Класс Solution должен содержать статический метод print() с параметром типа Integer.
4. Метод main() должен вызывать метод print() с параметром типа int.
5. Метод main() должен вызывать метод print() с параметром типа Integer.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer integer = 33;
        print(2);

        print(integer);
    }

    //Напишите тут ваши методы
    static void  print(int args)
    {
        args =10;
        int b = 2;
        int c;
        c = args+b ;
        System.out.println("int " +c);
    }

    public static void print(Integer integer)
    {
        System.out.println("integer "+integer);
    }

}
