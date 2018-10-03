package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();

        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код

        ArrayList<int[]> arr = new ArrayList<>();

        int[] arrList1 = {3,4,5};
        int[] arrList2 = {6,7,8};

        arr.add(arrList1);
        arr.add(arrList2);

        return arr;
    }

    public static void printList(ArrayList<int[]> list) {

        for (int[] array : list) {
            for (int x : array) {
                System.out.print(x+" ");
            }
            System.out.println(" ");
        }
    }
}
