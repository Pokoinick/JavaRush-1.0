package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя1");
        map.put("Фамилия4", "Имя2");
        map.put("Фамилия5", "Имя3");
        map.put("Фамилия6", "Имя4");
        map.put("Фамилия7", "Имя3");
        map.put("Фамилия8", "Имя4");
        map.put("Фамилия9", "Имя6");
        map.put("Фамилия10", "Имя5");
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> a = iterator.next();
            if (Collections.frequency(copy.values(), a.getValue())>1)
                removeItemFromMapByValue(map, a.getValue());
        }
        System.out.println(map);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args)
    {
        removeTheFirstNameDuplicates(createMap());
    }
}
