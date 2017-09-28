package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> min = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++)
        {
            if( i == 0)
                min.add(0, list.get(i));
            else
                if(list.get(i).length() < min.get(0).length())
                    min.set(0, list.get(i));
        }
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == min.get(0).length())
                min.add(list.get(i));
        }
        for (int i = 1; i < min.size(); i++)
        {
            System.out.println(min.get(i));
        }

    }
}
