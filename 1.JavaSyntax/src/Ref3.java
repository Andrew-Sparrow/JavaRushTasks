/**
 * Created by Администратор on 15.01.2018.
 */
public class Ref3
{
    static int n1 = 10;

    public static int  swap(int n2) //
    {
        System.out.println("M222=" + n2);
        n2 = n2*5;
        System.out.println("M111=" + n2);
        return n2;
    }
    public static void main (String[] args)
    {
        System.out.println("M=" + n1);
        swap(n1);
        System.out.println("n1 = " + Ref3.n1);
        System.out.println("n2 in swap = "+swap(n1));

    }

}
