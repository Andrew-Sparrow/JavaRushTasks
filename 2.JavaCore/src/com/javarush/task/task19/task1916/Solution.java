package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution
{
    public static List<LineItem> lines = new ArrayList<LineItem>();
    
    public static void main(String[] args) throws IOException
    {
        String fileNameRead1 = "F:/1.txt";
        String fileNameRead2 = "F:/2.txt";
        
        FileReader fileReader1 = new FileReader(fileNameRead1);
        FileReader fileReader2 = new FileReader(fileNameRead2);
    
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        
        List<String> listString1 = new ArrayList<>();
        List<String> listString2 = new ArrayList<>();
        
        while (bufferedReader1.ready())
        {
            String s = bufferedReader1.readLine();
            listString1.add(s);
        }
        fileReader1.close();
        bufferedReader1.close();
        
        while (bufferedReader2.ready())
        {
            String s = bufferedReader2.readLine();
            listString2.add(s);
        }
        fileReader2.close();
        bufferedReader2.close();
        
        //int sizeLeastListString ;
        
        if(listString1.size() > listString2.size())
        {
            int countListString2 = 0;
            
            for (int i = 0; i < listString1.size(); i++)
            {
                System.out.println(i +" " + countListString2);
               
                if(listString1.get(i).equals(listString2.get(countListString2)))
                {
                    lines.add(new LineItem(Type.SAME , listString1.get(i)));
                    System.out.println(" The same");
                    
                    if(countListString2 < listString2.size() -1)
                    {
                        countListString2++;
                    }
                }
                else
                {
                    // take penultimate element, to avoid exception when checking equivalence
                    if( i < listString1.size() - 1 )
                    {
                        if (listString1.get(i + 1).equals(listString2.get(countListString2)))
                        {
                            System.out.println(" removed " + listString1.get(i) + " " + listString2.get(countListString2));
                            lines.add(new LineItem(Type.REMOVED, listString1.get(i)));
                        }
                        else if(listString1.get(i).equals(listString2.get(countListString2 + 1 )) )
                        {
                            lines.add(new LineItem(Type.ADDED, listString2.get(countListString2)));
                            System.out.println(" added " + listString1.get(i) + " " + listString2.get(countListString2));
                            
                            if(countListString2 < listString2.size() -1)
                            {
                                countListString2++;
                            }
                            i = i - 1;
                        }
                    }
                    // if it is a last element in listString1(fileReader1)
                    else
                    {
                        lines.add(new LineItem(Type.REMOVED, listString1.get(i)));
                    }
                }
            }
        }
        
        //lines.add(new LineItem(Type.SAME , listString1.get(i)));
        System.out.println();
        
        for ( LineItem lineItem : lines )
        {
            System.out.println(lineItem.toString());
        }
        
    }
    
    public static enum Type
    {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }
    
    public static class LineItem
    {
        public Type type;
        public String line;
        
        public LineItem(Type type, String line)
        {
            this.type = type;
            this.line = line;
        }
    
        @Override
        public String toString()
        {
            return type.toString()+ " " + line;
        }
    }
}
