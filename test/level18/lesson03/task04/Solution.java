package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int[] byteArray = new int[256];


        while (inputStream.available()>0){
            int data = inputStream.read();
            byteArray[data] += 1;
        }

        int min = Integer.MAX_VALUE;
        List<Integer> minRepeats = new ArrayList<>();
        minRepeats.add(0);

        for (int i = 0; i < byteArray.length; i++)
        {
            if (byteArray[i] != 0 && min > byteArray[i]) {
                min = byteArray[i];
                minRepeats.set(0, i);
            }
        }
        for (int i = 0; i < byteArray.length; i++)
        {
            if (minRepeats.get(0) != i && min == byteArray[i]) {
                minRepeats.add(i);
            }
        }

        for (int i : minRepeats)
        {
            System.out.print(i+" ");
        }
        reader.close();
        inputStream.close();
    }
}
