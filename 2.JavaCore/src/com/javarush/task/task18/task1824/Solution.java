package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s ="" ;//= bufferedReader.readLine();

        FileInputStream fis = null;

        while (true)
        {
            try
            {
                s = bufferedReader.readLine();
                fis = new FileInputStream(s);
            }
            catch (FileNotFoundException e)
            {
                bufferedReader.close();
                System.out.println(s);
                break;
            }
            finally
            {
                try
                {
                    if (fis != null)
                        fis.close();
                }
                catch (IOException e)
                {
                    System.err.println("shit");
                }
            }
        }
    }
}
