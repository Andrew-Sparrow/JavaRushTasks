package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        /*List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }*/

        Map<String, String> map = new HashMap<>();
        {
            map.put("Москва","Ивановы");
            map.put("Киев","Петровы");
            map.put("Лондон","Абрамовичи");
        }

        String family = reader.readLine();
        String city = map.get(family);

        System.out.println(city);
    }
}
