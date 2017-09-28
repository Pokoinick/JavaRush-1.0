package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Человек2", new Date("JUNE 1 1980"));
        map.put("Человек3", new Date("DECEMBER 1 1980"));
        map.put("Человек4", new Date("OCTOBER 1 1980"));
        map.put("Человек5", new Date("JUNE 1 1980"));
        map.put("Человек6", new Date("JUNE 1 1980"));
        map.put("Человек7", new Date("JUNE 1 1980"));
        map.put("Человек8", new Date("JUNE 1 1980"));
        map.put("Человек9", new Date("JANUARY 1 1980"));
        map.put("Человек10", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth()>4 && pair.getValue().getMonth()<8)
                iterator.remove();
        }
        System.out.println(map);

    }
}
