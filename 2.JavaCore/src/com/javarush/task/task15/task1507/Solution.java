package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution
{
    public static void main(String[] args)
    {
        printMatrix(2, 3, "8");                 //1
        printMatrix((short) 2, 3, "8");         //2
        printMatrix((short) 2, (short) 3, "8"); //3
        printMatrix((byte) 2, 3, "8");          //4
        printMatrix((byte) 2, (byte) 3, "8");   //5
        printMatrix(2, 3, 8);                   //6
        printMatrix((short) 2, 3, (byte) 8);    //7
        printMatrix((short) 2, 3, (short) 8);   //8
        printMatrix( 2, (short) 3, "8");        //9

    }

    public static void printMatrix(int m, int n, String value)//1
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }


    public static void printMatrix(short m, int n, String value)//2
    {
        System.out.println("Заполняем объектами 2");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, short n, String value)//3
    {
        System.out.println("Заполняем объектами 3");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(byte m, int n, String value)//4
    {
        System.out.println("Заполняем объектами 4");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(byte m, byte n, String value)//5
    {
        System.out.println("Заполняем объектами 5");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, int value)//6
    {
        System.out.println("Заполняем объектами 6");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, int n, byte value)//7
    {
        System.out.println("Заполняем объектами 7");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, int n, short value)//8
    {
        System.out.println("Заполняем объектами 8");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, short n, String value)//9
    {
        System.out.println("Заполняем объектами 9");
        printMatrix(m, n, (Object) value);
    }


    public static void printMatrix(int m, int n, Object value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
