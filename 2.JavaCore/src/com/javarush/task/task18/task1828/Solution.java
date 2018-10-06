package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.LineNumberReader;
import java.io.Reader;

import static java.lang.System.in;

public class Solution
{
    //This method writes lines from listLines to the file by fileWriter
    static void writeToFile(List<String> listLines, FileWriter fileWriter) throws IOException
    {
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
    //this method returns a changed list of lines
    static List<String> changeList(  String valueOfFirstArgument, List<String> listLines, String searchedIdFromArgs, String stringForReplacing)
    {
        for (int i = 0; i < listLines.size(); i++)
        {
            String str = listLines.get(i);
            
            if (str.isEmpty())
            {
                continue;
            }
            else
            {
                String substr = str.substring(0, 8).trim();
                
                if (searchedIdFromArgs.equals(substr))
                {
                    if(valueOfFirstArgument == "-u")
                    {
                        listLines.set(i, stringForReplacing);
                    }
                    else if(valueOfFirstArgument == "-d")
                    {
                        listLines.remove(i);
                    }
                }
            }
        }
        return  listLines;
    }
    
    public static void main(String[] args) throws IOException
    {
        // -u id productName price quantity
        
        String valueOfFirstArgument = args[0];
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String fileName = /*"F:/1.txt" ;*/ bufferedReader.readLine();
    
        bufferedReader.close();
        
    
        File file = new File(fileName);
        
        //Path path = file.toPath();
    
        String argsId = args[1];
        String idFormatted = String.format("%-8s", argsId);
        
        //this is a simple way to read all lines from file to list, but validator doesn't accept it :(
        // List<String> listLines = Files.readAllLines(path);
        
        //reading all lines from file
        List<String> listLines =  new ArrayList<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                listLines.add(line);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    
        if (args == null || args.length == 0) // if args is empty do nothing
        {
        
        }
        else if ("-u".equals(args[0]))
        {
            try(FileWriter fileWriter = new FileWriter(file);)
            {
                String productName = new String();
    
                String price = args[args.length -2];
                price = String.format("%-8s", price);
    
                String quantity = args[args.length -1];
                quantity = String.format("%-4s", quantity);
                
    
                int indexOfPrice = args.length - 2;
                
                // get name of product from args
                for (int i = 2; i < indexOfPrice; i++)
                {
                    if (i != indexOfPrice - 1)
                    {
                        productName = productName + args[i] + " ";
                    }
                    else
                    {
                        productName = productName + args[i];
                    }
                }
    
                productName = String.format("%-30s", productName);
                
                //summary line from args after formatting
                String replace = idFormatted + productName + price + quantity;
                
                listLines = changeList("-u", listLines, argsId, replace);
                
                //This writes changed list to file
                writeToFile(listLines, fileWriter);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        else if("-d".equals(args[0]))
        {
            try(FileWriter fileWriter = new FileWriter(file))
            {
                //remove needed line from list
                listLines = changeList("-d", listLines, argsId, "");
                
                // it writes lines from listLines to file
                writeToFile(listLines, fileWriter);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
