package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] arr = s.toCharArray();
        if(!Character.isWhitespace(arr[0]))
            arr[0] = Character.toUpperCase(arr[0]);
        for (int i = 0; i < arr.length-1; i++)
        {
            if (Character.isWhitespace(arr[i])){
                if (!Character.isWhitespace(arr[i + 1])){
                    arr[i + 1] = Character.toUpperCase(arr[i + 1]);
                }
            }
        }
        for (char c: arr)
        {
            System.out.print(c);
        }


    }


}
