package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        
        for(int i=1; i<11; i++)
        {
            for(int y=1 ; y<11 ; y++)
            {
                int z = y * i;
                
                if(y==10)
                {
                   if(z<100)
                   System.out.println(" "+z); 
                   else 
                   System.out.println(z); 
                }
                
                else
                {
                    if(z>0 && z<10)
                    System.out.print("  "+z+" ");
                    else
                    System.out.print(" "+z+" ");
                }
            }
        }
    }
}
