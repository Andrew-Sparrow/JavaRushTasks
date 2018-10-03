package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

//import static jdk.nashorn.internal.objects.NativeMath.round;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String fileName =  /*"C:/1.txt" ;*/ args[0];

        FileInputStream istream = new FileInputStream(fileName);
        
        double numSpace = 0;

        double numAll = istream.available() ;
        
        while (istream.available() > 0)  //verify for a space
        {
            char ch = (char) istream.read();
            
            if(Character.isSpaceChar(ch))
            {
                numSpace++;
            }
        }
        
        istream.close();
        
        double d =  (numSpace  / numAll) * 100.0;

       /* String strDouble = String.format("%.2f", d);    // 1 variant

        DecimalFormat df = new DecimalFormat(".##");
        String strDouble = df.format(d);*/

        Locale locale = Locale.ENGLISH;

        NumberFormat strDouble = NumberFormat.getNumberInstance(locale);

        strDouble.setMinimumFractionDigits(2);

        strDouble.setMaximumFractionDigits(2);

        String s = strDouble.format(d) ;

        System.out.println(s);




    }
    

}
