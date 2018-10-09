package com.javarush.task.task19.task1914;

/* 
Решаем пример
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
        
        String[] strArr = byteArrayOutputStream.toString().split(" ");
        
        int firstNumber = Integer.parseInt(strArr[0]);
        int secondNumber = Integer.parseInt(strArr[2]);
    
        int resultNumber = 0 ;
        String resultString = new String();
        
        if("+".equals(strArr[1]))
        {
            resultNumber = firstNumber + secondNumber ;
            resultString = firstNumber + " + " + secondNumber + " = " + resultNumber;
        }
        else if("-".equals(strArr[1]))
        {
            resultNumber = firstNumber - secondNumber ;
            resultString = firstNumber + " - " + secondNumber + " = " + resultNumber;
        }
        else if("*".equals(strArr[1]))
        {
            resultNumber = firstNumber * secondNumber ;
            resultString = firstNumber + " * " + secondNumber + " = " + resultNumber;
        }
        
        System.setOut(originalPrintStream);
    
        System.out.println(resultString);
        
        byteArrayOutputStream.close();
        printStream.close();
        
    }
    
    public static class TestString
    {
        public void printSomething()
        {
            System.out.println("3 + 6 = ");
        }
    }
}

