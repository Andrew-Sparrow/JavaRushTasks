package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution
{
    public static TestString testString = new TestString();
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = /*"F:/1.txt";*/  bufferedReader.readLine();
        
        bufferedReader.close();
    
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
    
        PrintStream originalPrintStream = System.out;
    
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        
        System.setOut(printStream);
        
        testString.printSomething();
        
        String result = byteArrayOutputStream.toString();
        
        byte[] chArr = result.getBytes();
        
        System.setOut(originalPrintStream);
    
        System.out.println(result);
        fileOutputStream.write(chArr);
        
        fileOutputStream.close();
    }
    
    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("it's a text for testing");
        }
    }
}

