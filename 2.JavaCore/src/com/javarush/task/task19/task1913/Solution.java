package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayInputStream;
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
        
        String result = byteArrayOutputStream.toString().replaceAll("\\D", "");
        
        System.setOut(originalPrintStream);
    
        System.out.println(result);
        
        //originalPrintStream.close();
        byteArrayOutputStream.close();
        printStream.close();
    }
    
    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
