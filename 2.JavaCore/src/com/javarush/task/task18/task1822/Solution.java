package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName = /*"C:/1.txt";      //*/  reader.readLine();
        
        reader.close();
        
        String id = args[0];
        
        int intId = Integer.parseInt(id);

        try( BufferedReader readBuff = new BufferedReader(new FileReader(new File(fileName)))  )
        {
            String line ;

            while((line = readBuff.readLine()) != null)
            {
                String [] stringArray = line.split(" ");
                
                if(Integer.parseInt(stringArray[0]) == intId)
                {
                    for(int i = 0; i < stringArray.length; i++)
                    {
                        if(i== stringArray.length-1)
                        {
                            System.out.print(stringArray[i]);
                        }
                        else
                        {
                            System.out.print(stringArray[i]+" ");

                        }
                    }
                }
            }

            
            readBuff.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
