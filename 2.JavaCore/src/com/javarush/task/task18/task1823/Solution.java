package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution
{
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s;

        ArrayList<String> arrFileName = new ArrayList<>();

        while (true) // read name of new file
        {
            s = bufferedReader.readLine();

            if("exit".equals(s))
                break;

            arrFileName.add(s); // add filename to ArrayList
        }

        bufferedReader.close();


        ReadThread readThread;

        for ( String fileName: arrFileName ) // get fileName and create new Thread , start new Thread, and wait the end
        {
            readThread = new ReadThread(fileName);
            readThread.start();
            readThread.join();
        }

    }

    public static class ReadThread extends Thread
    {
        String fileName ;

        public ReadThread(String fileName)
        {
            //implement constructor body
            this.fileName = fileName ;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run()
        {
            FileReader fileReader = null;

            try
            {
                fileReader = new FileReader(fileName); // new stream reading file
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }

            Map<Character, Integer> map = new TreeMap<>();

            int count = 1 ;

            int data1 ;

            try
            {
                while(( data1 = fileReader.read()) != -1) // put every charcter to map
                {
                    Character ch = (char)data1;

                    if(map.containsKey(ch))
                    {
                        int num = map.get(ch);

                        ++num;

                        map.put(ch, num);
                    }
                    else
                    {
                        map.put(ch, count);
                    }
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                fileReader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            int maxValue = 0 ;

            Character maxKey ='!' ;

            for (Map.Entry<Character, Integer> pair : map.entrySet()) // find out maximum frequency
            {
                Character key = pair.getKey();
                Integer value = pair.getValue();

                if(value > maxValue)
                {
                    maxValue = value ;
                    maxKey = key;
                }
            }

            resultMap.put(fileName, (int)maxKey);
        }
    }
}
