/**
 * Created by Администратор on 14.01.2018.
 */
public class ref2 // example of swap variables
{
     static int num1 = 5;
     static int num2 = 10;

    public static void main (String[] args)
    {
        System.out.println("M=" + num1 + " N=" + num2);
        swap(num1, num2);
        System.out.println("M=" + num1 + " N=" + num2);
    }
    public static void swap(int a, int b)
    {
        num1 = b;
        num2 = a;
    }
}
