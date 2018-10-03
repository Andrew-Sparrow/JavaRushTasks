package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;
import java.io.StreamTokenizer;
import java.nio.ByteBuffer;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 =  reader.readLine();
        String fileName2 =  reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);

        byte[] b = new byte[1];


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);

        byte[] bb = "whitespace! ".getBytes();
        byte[] b2 = "number! ".getBytes();

        Integer num ;
        double d ;
        String  s ;


        while (fileInputStream1.available() > 0)
        {
            int data = fileInputStream1.read();

            if(!Character.isWhitespace(data))
            {
                byteArrayOutputStream.write(data);
                b = byteArrayOutputStream.toByteArray();
            }
            else
            {
                s = new String(b);

                d = new Double(s);

                if(d < 0)
                {
                    BigDecimal bd = new BigDecimal(d).setScale(0, RoundingMode.HALF_DOWN);
                    num = bd.intValue();
                }
                else
                {
                    BigDecimal bd = new BigDecimal(d).setScale(0, RoundingMode.HALF_UP);
                    num = bd.intValue();
                }

                b = num.toString().getBytes();

                fileOutputStream2.write(b);
                fileOutputStream2.write(data);
                byteArrayOutputStream.reset();
            }
        }

        String s1 = new String(b); // writing last number to the file

        d = new Double(s1);

        if(d < 0)
        {
            BigDecimal bd = new BigDecimal(d).setScale(0, RoundingMode.HALF_DOWN);
            num = bd.intValue();
        }
        else
        {
            BigDecimal bd = new BigDecimal(d).setScale(0, RoundingMode.HALF_UP);
            num = bd.intValue();
        }

        b = num.toString().getBytes();


        fileOutputStream2.write(b);

        fileInputStream1.close();
        fileOutputStream2.close();
    }
}
