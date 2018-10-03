package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrFileName = new ArrayList<>(); // arr for fileName

        String s  ;

        while (true) // read the name of new file // add fileName to the "arrFileName"
        {
            s = bufferedReader.readLine();

            if("end".equals(s))
                break;

            arrFileName.add(s); // add filename to ArrayList
        }

        bufferedReader.close();


        Collections.sort(arrFileName);  // sort "arrFileName"


        String[] stringArray = arrFileName.get(0).split(".part");
        String summaryFileName = stringArray[0];


        File finalFile = new File( summaryFileName); // create file for OutPutStream


        finalFile.createNewFile(); // if finalFile already exists will do nothing

        FileOutputStream fileOutputStream = new FileOutputStream(summaryFileName, true);

        FileInputStream fileInputStream = null;

        for (String path: arrFileName)
        {
            fileInputStream = new FileInputStream(path);

            byte[] buffer = new byte[fileInputStream.available()];

            int count = fileInputStream.read(buffer);
            fileInputStream.close();

            fileOutputStream.write(buffer, 0, count);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
