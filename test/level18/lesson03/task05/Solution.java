package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        List<Integer> sortBytes = new ArrayList<>();
        while (inputStream.available()>0) {
            int data = inputStream.read();
            if (!sortBytes.contains(data))
            sortBytes.add(data);
        }

        for (int i: sortBytes)
        {
            for (int j = 0; j < sortBytes.size()-1; j++)
            {
                int temp;
                if(sortBytes.get(j)>sortBytes.get(j+1)) {
                    temp = sortBytes.get(j);
                    sortBytes.set(j, sortBytes.get(j+1));
                    sortBytes.set(j+1, temp);
                }
            }

        }

    }
}
