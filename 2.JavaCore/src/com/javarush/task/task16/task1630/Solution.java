/*
* необходимо считать имя двуж файлов с консоли и вывести содержимое
* файлов в одну строку через пробел,
* содержимое каждого файла в одной строке.*
* */

package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution
{
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // reader.close();

        try
        {
            /*String str1  = reader.readLine();
            String str2  = reader.readLine();*/

            firstFileName = /*str1 ;*/  "C://source1.txt";
            secondFileName = /*str2 ;*/ "C://source2.txt";
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException
    {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();

        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface
    {
        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread  extends Thread implements ReadFileInterface
    {
        String fullFileName ;
        String fileContent  = "";

        @Override
        public void setFileName(String fullFileName)
        {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            return fileContent;
        }
        @Override
        public void run()
        {
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(fullFileName));

                String line;

                while ((line = reader.readLine()) != null)
                {
                    fileContent = fileContent + line+ " " ;
                }

                reader.close();

            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
