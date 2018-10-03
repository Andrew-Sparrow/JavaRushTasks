package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> months = new ArrayList<>();

        months.add("");
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");

        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");

        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println(months.indexOf("May"));

    }
}
