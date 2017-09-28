package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Высоцкий", "Стас");
        map.put("Весин", "Вася");
        map.put("Петeн", "Петя");
        map.put("Стасин", "Стас");
        map.put("Петин", "Вася");
        map.put("Васeн", "Петя");
        map.put("Игорeн", "Вася");
        map.put("Игорин", "Петя");
        map.put("Эопин", "Игорь");
        map.put("Пипин", "Петя");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        //напишите тут ваш код
        for (Map.Entry<String, String> a : map.entrySet())
        {
            if (a.getValue().equals(name))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        //напишите тут ваш код
        for (Map.Entry<String, String> a : map.entrySet())
        {
            if (a.getKey().equals(lastName))
                count++;
        }

        return count;
    }
    public static void main(String[] args)
    {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(),"Вася"));
        System.out.println(getCountTheSameLastName(createMap(), "Высоцкий"));
    }
}
