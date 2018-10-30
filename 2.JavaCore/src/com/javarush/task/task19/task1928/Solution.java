package com.javarush.task.task19.task1928;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* 
Исправить ошибку. Классы и интерфейсы
*/

/*From me.
* Here, you need to put your file for reading to directory
* "F:\Dropbox\Developing Testing\JavaRushHomeWork\JavaRushTasks\2.JavaCore\src"
* because it needs relative path in line 27
* */
public class Solution
{
    {
        System.out.println("This is the Solution class");
    }
    
    public static void main(String... args) throws IOException
    {
        try
        (
                FileOutputStream outputStream = new FileOutputStream(args[0]);
                InputStream is = Solution.class.getClassLoader().getResourceAsStream(args[1]);
        )
        {
            
            byte[] b = new byte[is.available()];
            outputStream.write(is.read(b));
            
            int value = 123_456_789;
            System.out.println(value);
            
            Example result = null;
            
            String s = "c";
            switch (s)
            {
                case "a":
                {
                    result = new Solution().new A();
                    break;
                }
                case "b":
                {
                    result = new Solution().new B();
                    break;
                }
                case "c":
                {
                    result = new Solution().new C();
                    break;
                }
            }
            
            if (result instanceof C)
            {
                C p = (C) result;
                System.out.println(p.getClass().getSimpleName());
                
            }
            
        }
        catch (IOException e)
        {
            System.out.println("file for InputStream not found");
        }
    }
    
    interface Example
    {
    }
    
    class A implements Example
    {
        {
            System.out.println("This is the A class");
        }
    }
    
    class B implements Example
    {
        {
            System.out.println("This is the B class");
        }
    }
    
    class C extends A
    {
        {
            System.out.println("This is the C class");
        }
    }
}
