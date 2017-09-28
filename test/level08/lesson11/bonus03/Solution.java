package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
    /*    for (int i = 0; i < array.length-1; i++)
        {
            for (int j = 0; j < array.length-1; j++)
            {
                if ((int) array[j].charAt(0) > (int) array[j + 1].charAt(0))
                {
                    String local = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = local;
                }
            }
        }
        */
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = 0; j < array.length-1; j++)
            {
                if (isGreaterThan(array[j], array[j + 1]))
                {
                    String local = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = local;
                }
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
