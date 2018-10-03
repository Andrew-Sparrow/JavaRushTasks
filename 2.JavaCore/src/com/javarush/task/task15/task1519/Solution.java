package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import static jdk.nashorn.internal.runtime.JSType.isNumber;

/* 
Разные методы для разных типов
*/

public class Solution
{
    static String s ;

    public static void main(String[] args) throws IOException
    {
        //напиште тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            /*
            // first solution
            while(true){
                try
                {
                    s = bufferedReader.readLine();

                    if ("exit".equals(s))
                        break;

                    else if (s.contains("."))
                    {
                        Double d = Double.parseDouble(s);
                        print(d);
                    }
                    else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128)
                    {
                        int intg = Integer.parseInt(s);
                        print(intg);
                    }
                    else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128)
                    {
                        Short sh = Short.parseShort(s);
                        print(sh);
                    }
                }

                catch(NumberFormatException e)
                {
                    print(s);
                }


        }
        */

        //second solution
        /*while(!("exit".equals(s = bufferedReader.readLine()))){
    
            try
            {
                if(isNumber(s)){

                    if (s.contains("."))
                    {
                        Double d = Double.parseDouble(s);
                        print(d);
                    }
                    else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128)
                    {
                        int intg = Integer.parseInt(s);
                        print(intg);
                    }
                    else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128)
                    {
                        Short sh = Short.parseShort(s);
                        print(sh);
                    }
                    else if(Long.parseLong(s)>Integer.MAX_VALUE || Long.parseLong(s)< Integer.MIN_VALUE) {

                        Long lo = Long.parseLong(s);

                        System.out.println("too match number n/" + lo);
                    }
                }

                
            }
            catch(NumberFormatException e)
            {
                print(s);
            }
        }*/

    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }
}
