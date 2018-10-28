package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{
    
    public static TestString testString = new TestString();
    
    public static void main(String[] args)
    {
        PrintStream consoleStream = System.out;
    
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        
        System.setOut(stream);
        testString.printSomething();
        
        String outputStreamString  = byteArrayOutputStream.toString();
        
        Pattern pattern = Pattern.compile("\\r\\n");
        Matcher m = pattern.matcher(outputStreamString);
        
        //outputStreamString = m.replaceAll("\r\nvvv\r\n");
        
        String[] strArr = outputStreamString.split("\\n");
        
        StringBuilder stringBuilder = new StringBuilder();
        
        int n = 0;
        for (int i = 0; i < strArr.length; i++)
        {
            ++n;
            if( n == 2 )
            {
                stringBuilder = stringBuilder.append(strArr[i]+"\nJavaRush - курсы Java онлайн\n");
                n = 0;
            }
            else
            {
                stringBuilder = stringBuilder.append(strArr[i]+"\n");
            }
            
        }
        byteArrayOutputStream.reset();
    
        System.out.println(stringBuilder);
        outputStreamString  = byteArrayOutputStream.toString();
        
        System.setOut(consoleStream);
    
        System.out.println(outputStreamString);
        //System.out.println(stringBuilder);
        
        stream.close();
        consoleStream.close();
    }
    
    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
