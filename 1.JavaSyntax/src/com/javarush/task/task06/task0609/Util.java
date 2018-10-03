package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double result = 0.0;
        double distance_x = 0.0;
        double distance_y = 0.0;


            distance_x = abs(x2-x1);

            distance_y = abs(y2-y1);


        result = sqrt(distance_x*distance_x + distance_y*distance_y);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(getDistance(-1,-1, 2, 2));

    }
}
