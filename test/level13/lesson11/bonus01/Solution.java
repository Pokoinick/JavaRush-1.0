package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(new FileReader(fileName));

        while (scanner.hasNextLine())
        {
            int i = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0 )
            list.add(i);
        }
        reader.close();
        scanner.close();

        arraySort(list);
        for (int i: list)
        {
            System.out.println(i);
        }
    }

    private static void arraySort(ArrayList<Integer> array) {
        for (int i: array)
        {
            for (int j = 0; j < array.size()-1; j++)
            {
                if (array.get(j) > array.get(j+1))
                {
                    int temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, temp);

                }
            }
        }
    }
}
