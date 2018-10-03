package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("В напрасных поисках за ней");
        arrayList1.add("Я исследил земные тропы");

        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("Весенний день горяч и золот, —");
        arrayList2.add("Весь город солнцем ослеплен!");

        ArrayList<String>[] arrays = new ArrayList[]{arrayList1, arrayList2};

        return arrays;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("-------");
        }
    }
}