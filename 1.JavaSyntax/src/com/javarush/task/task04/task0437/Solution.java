package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        for(int j=1; j<=10; j++)
        {
            for(int i = 1; i<=j ; i++)
            {
                System.out.print(8);
            }
            System.out.println("");
        }

    }
}
