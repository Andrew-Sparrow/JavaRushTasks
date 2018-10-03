package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in));

        String name = bufferedReader.readLine();
        String str_years= bufferedReader.readLine();
        int int_years= Integer.parseInt(str_years);

        System.out.println(name + " захватит мир через "+ int_years+" лет. Му-ха-ха!");
    }
}
