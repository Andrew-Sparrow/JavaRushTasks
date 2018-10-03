/**
 * Created by Администратор on 13.01.2018.
 */
public class ref1
{
    public static void main (String[] args) //The exchanging of values of two variables
    {
        int a = 1;
        int b = 2;

        System.out.println("a=" +a+ " b=" + b);

        int num1 = a;
        int num2 = b;

        a = num2;
        b = num1;

        System.out.println("a=" +a+ " b=" + b);
    }
}
