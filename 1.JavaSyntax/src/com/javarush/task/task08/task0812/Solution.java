package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();
    
        for (int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<String> list2 = new ArrayList();


        int max_quant= 1;
        int number = 0;


        for (int i = 0; i < list.size(); i++) //find out max sequence
        {
            if(i==0)
            {
                number = list.get(i);
            }
            else if(list.get(i).equals(list.get(i-1)))
            {
                max_quant++;

                if(i==list.size()-1)
                {
                    list2.add(number + "-" + max_quant);
                }
            }
            else
            {
                list2.add(number+"-"+max_quant);
                number = list.get(i);
                max_quant=1;

                if(i==list.size()-1)
                {
                    list2.add(number + "-" + max_quant);
                }
            }
        }

        //System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList();

        for (int i = 0; i < list2.size(); i++) //add to array second value
        {
            String[] str = list2.get(i).split("-");

            list3.add(Integer.parseInt(str[1]));
        }

        //System.out.println(list3);
    
        int max = list3.get(0);
    
        for (int i = 0; i < list3.size() ; i++) // find out maximum
        {
            if(list3.get(i)> max)
            {
                max= list3.get(i);
            }
        }
        System.out.println(max);
    }
}