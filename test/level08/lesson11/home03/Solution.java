package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("LastName1", "FirstName1");
        map.put("LastName2", "FirstName2");
        map.put("LastName3", "FirstName3");
        map.put("LastName4", "FirstName1");
        map.put("LastName5", "FirstName2");
        map.put("LastName6", "FirstName3");
        map.put("LastName7", "FirstName2");
        map.put("LastName1", "FirstName5");
        map.put("LastName2", "FirstName3");
        map.put("LastName3", "FirstName7");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
