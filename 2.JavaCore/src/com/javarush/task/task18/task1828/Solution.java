package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.io.LineNumberReader;
import java.io.Reader;

import static java.lang.System.in;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // -u id productName price quantity
        
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String fileName = "F:/1.txt" ; //bufferedReader.readLine();
    
        // bufferedReader.close();
        
        
    
        File fileForReading = new File(fileName);
        
        Path path = fileForReading.toPath();
    
        String searchId = args[1];
        String searchIdFormatted = String.format("%-8s", searchId);
    
        List<String> listLines = Files.readAllLines(path);
    
        FileReader fileReader = new FileReader(fileForReading);
        FileWriter fileWriter = new FileWriter(fileForReading);
        
    
        if (args == null || args.length == 0) // if args is empty do nothing
        {
        
        }
        if ("-u".equals(args[0]))
        {
            try
            {
                String productName = args[2];
                productName = String.format("%-30s", productName);
    
                String price = args[3];
                price = String.format("%-8s", price);
    
                String quantity = args[4];
                quantity = String.format("%-4s", quantity);
    
                String replace = searchIdFormatted + productName + price + quantity;
                
        
                for (int i = 0 ; i < listLines.size(); i++)
                {
                    String str = listLines.get(i);
                    
                    if(str.isEmpty())
                    {
                        continue;
                    }
                    else
                    {
                        String substr = str.substring(0, 8).trim();
    
                        if (searchId.equals(substr))
                        {
                            str = str.replaceAll("(.+)", replace);
                            listLines.set(i, replace);
                        }
                    }
                }
        
                fileReader.close();
                
                for(int i = 0 ; i < listLines.size(); i++)
                {
                    String s = "";
                    
                    if(i != listLines.size()-1)
                    {
                        s = listLines.get(i) + "\n";
                    }
                    else
                    {
                        s =  listLines.get(i);
                    }
                    
                    fileWriter.write(s);
                }
                
                //fileWriter.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        /*else if("-d".equals(args[0])) //TODO - refactor this all!
        {
            try
            {
        
                for (int i = 0 ; i < listLines.size(); i++)
                {
                    String str = listLines.get(i);
            
                    if(str.isEmpty())
                    {
                        continue;
                    }
                    else
                    {
                        String substr = str.substring(0, 8).trim();
                
                        if (searchId.equals(substr))
                        {
                            listLines.remove(i);
                        }
                    }
                }
        
                for(int i = 0 ; i < listLines.size(); i++)
                {
                    String s = "";
            
                    if(i != listLines.size()-1)
                    {
                        s = listLines.get(i) + "\n";
                    }
                    else
                    {
                        s =  listLines.get(i);
                    }
            
                    fileWriter.write(s);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            //fileReader.close();
            //fileWriter.close();
        }
        */
    }
}
