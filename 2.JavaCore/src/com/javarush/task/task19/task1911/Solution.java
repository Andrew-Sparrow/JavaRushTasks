package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution
{
    public static TestString testString = new TestString();
    
    public static void main(String[] args) throws IOException
    {
        PrintStream originalPrintStream = System.out;
        
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        
        System.setOut(printStream);
        
        testString.printSomething();
        
        String result = byteArrayOutputStream.toString().toUpperCase();
        
        //byteArrayOutputStream.close();
        
        System.setOut(originalPrintStream);
    
        System.out.println(result);
        
    }
    
    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's a text for testing");
        }
    }
}
