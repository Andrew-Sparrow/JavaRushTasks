package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream
{
    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream fileOutputStream ;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException
    {
        super(fileName);

        this.fileOutputStream = fileOutputStream;
    }

    public void write(byte[] b, int off, int len) throws IOException
    {
        fileOutputStream.write(b, off, len);
    }

    public void write(byte[] b) throws IOException
    {
        fileOutputStream.write(b);
    }

    public void write(int i) throws IOException
    {
        fileOutputStream.write(i);
    }

    public void flush() throws IOException
    {
        fileOutputStream.flush();
    }

    public  void  close() throws IOException
    {
        fileOutputStream.flush();

        String s = "JavaRush © All rights reserved.";

        byte[] b = s.getBytes();

        fileOutputStream.write(b);

        fileOutputStream.close();
    }


    public static void main(String[] args) throws IOException
    {
       new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
