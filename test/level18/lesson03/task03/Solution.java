package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int[] byteArray = new int[256];


        while (inputStream.available()>0) {
            int data = inputStream.read();
            byteArray[data]+= 1;
        }
        List<Integer> maxRepeats = new ArrayList<>();
        maxRepeats.add(0);
        int max = 0;
        for (int i = 0; i < byteArray.length; i++)
        {
            if (byteArray[i] != 0 && byteArray[i] > max)
            {
                max = byteArray[i];
                maxRepeats.set(0, i);
            }
        }
        for (int i = 0; i < byteArray.length; i++)
        {
            if (i != maxRepeats.get(0) && byteArray[i] == max)
            {
                maxRepeats.add(i);
            }
        }

        for (int i: maxRepeats)
        {
            System.out.println(i);
        }

        reader.close();

    }
}
