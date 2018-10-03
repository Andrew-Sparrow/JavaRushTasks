/**
 * Created by Администратор on 13.01.2018.
 */
public class ss
{

    static int a = 5 ;
    static int b = 10;

    public static class MyResult {

        static int a1;
        static int b2;


        public MyResult (int number1, int number2){

            this.a1 = number1;
            this.b2 = number2;
        }

        public static MyResult swap(int as, int bs) { // returning two's values in the method and exchanging the place each other

            int n1 = as;
            int n2 = bs;

            b = n1;
            a = n2;

            return new MyResult(a, b);

        }
        public static void main (String[] args)
        {

            System.out.println("M=" +a+ " N=" + b);
            swap(a, b);
            System.out.println("M=" + a1+ " N=" + b);

        }

    }

}

