import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Администратор on 29.04.2018.
 */


public class Example_1_exceptions
{
    public static class ExceptionExample2
    {
        public static void main(String[] args)  {
            try {
                Throwable t = new Exception(); // а лететь будет Exception
                //throw t;
            } catch (Exception e) { // и мы перехватим Exception
                System.out.println("Перехвачено!");
            }
        }
    }
}
