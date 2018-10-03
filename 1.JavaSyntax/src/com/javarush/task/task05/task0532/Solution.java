package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(;true;)
        {
            int num_of_lines = Integer.parseInt(reader.readLine()); // assigned number of lines

            if (num_of_lines <= 0) //
            {
                System.out.println("Enter the number more than \"0\" ");
            }
            else // if the number more than "0" , the program continues to work
            {
                System.out.println("You entered number of lines. Please enter "+ num_of_lines+ " numbers with the new line each other.");

                int maximum = Integer.parseInt(reader.readLine());

                //напишите тут ваш код

                for (int ic = 0; ic < num_of_lines - 1; ic++)
                {
                    int num = Integer.parseInt(reader.readLine());

                    if (num > maximum)
                        maximum = num;
                }

                System.out.println("The maximum is " + maximum);
                break;
            }
        }
    }
}
