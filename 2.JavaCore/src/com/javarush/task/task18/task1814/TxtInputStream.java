package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream 
{
    //FileInputStream fileInputStream ;
    
    public FileInputStream  fileInputStream ;
    
    String fileName;

    public TxtInputStream(String fileName)  throws IOException, UnsupportedFileNameException
    {
           super(fileName);
           
           
            if(!fileName.endsWith(".txt"))
            {
                //super(fileName);
                
                //super.close();
               // throw new UnsupportedFileNameException() ;
               super.close();
               throw new UnsupportedFileNameException();
            }
             
            else
            {
                this.fileName = fileName;
                this.fileInputStream = new FileInputStream(fileName);
            }
        
        
    }

    public static void main(String[] args) throws UnsupportedFileNameException, FileNotFoundException, IOException
    {
         
    }
}

