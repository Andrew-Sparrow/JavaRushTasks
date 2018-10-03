/**
 * Created by Администратор on 16.01.2018.
 */
public class Ref4
{
    private static int a1 = 5;  /*explanation of references in static objects */

    static Ref4 a = new Ref4();

    public static void main(String[] args)
    {

        System.out.println("M=" + a.a1 );

        Ref4 b = a;

        System.out.println("b=" + b.a1 );

        b.a1 =10;

        System.out.println("b=" + b.a1 );
        System.out.println("a=" + a.a1 );

        Ref4 c = new Ref4();

        Ref4.a1 = 0;

        System.out.println("a1 = " + a1);
        System.out.println("b=" + b.a1 );
    }
}
