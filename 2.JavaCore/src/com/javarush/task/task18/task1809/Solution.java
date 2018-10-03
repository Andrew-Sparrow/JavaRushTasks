package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import  org.apache.commons.lang3.ArrayUtils ;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        byte[] streamArray = new byte[inputStream.available()];

        int count = inputStream.read(streamArray);
    
        for (int i = 0; i < streamArray.length/2; i++)
        {
            byte temp = streamArray[i];

            streamArray[i] = streamArray[streamArray.length -1 -i];

            streamArray[streamArray.length -1 - i] = temp;
        }

        outputStream.write(streamArray, 0 , count);

        reader.close();
        inputStream.close();
        outputStream.close();


    }
}
