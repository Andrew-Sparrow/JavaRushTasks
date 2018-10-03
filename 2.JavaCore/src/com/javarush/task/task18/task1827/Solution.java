package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //F:/JavaRush_tasks/task1825/file1.txt

        //-c СуперШлепки для пофигистов,раzme 12345.12 8888

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();

        bufferedReader.close();

       // String fileName = "F:/JavaRush_tasks/task1825/file1.txt" ;


        if (args == null || args.length == 0) // if args is empty do nothing
        {

        }
        else
        {
            if ("-c".equals(args[0]))
            {

                String productName = new String();

                String increasedMaxIdString;

                String price = args[args.length -2];
                price = String.format("%-8s", price);

                String quantity = args[args.length -1];
                quantity = String.format("%-4s", quantity);


                //find out if the value is a number,
                //to determine last index of product name

                int indexOfNumber = args.length - 2;

                for (int i = 1; i < indexOfNumber; i++) // get name of product
                {
                    if (i != indexOfNumber - 1)
                    {
                        productName = productName + args[i] + " ";
                    }
                    else
                    {
                        productName = productName + args[i];
                    }
                }

                productName = String.format("%-30s", productName);


                //Path path = Paths.get(fileName);

                ArrayList<String> listLines =  new ArrayList<>(); //Files.readAllLines(path);

                try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
                {
                    String line;
                    while ((line = br.readLine()) != null)
                    {
                       listLines.add(line);
                    }

                    br.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

                int[] arrFindMaxIndex = new int[listLines.size()];

                for (int i = 0; i < listLines.size(); i++) // find out maximum from "id"
                {
                    String str = listLines.get(i);

                    arrFindMaxIndex[i] = Integer.parseInt(str.substring(0, 8).trim());
                }

                Arrays.sort(arrFindMaxIndex); // find out max index

                Integer maxId = arrFindMaxIndex[arrFindMaxIndex.length - 1];

                ++maxId;


                //String productName = product.s

                //try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true))))

                increasedMaxIdString = maxId.toString();

                increasedMaxIdString = String.format("%-8s", increasedMaxIdString);

                BufferedWriter output = new BufferedWriter(new FileWriter(fileName, true));  //clears file every time

                output.newLine();

                output.append(increasedMaxIdString + productName + price +quantity);

                output.close();

            }
        }
    }
}
