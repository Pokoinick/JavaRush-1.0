package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<>();
        map.put("Cat1", new Cat("CatName1"));
        map.put("Cat2", new Cat("CatName2"));
        map.put("Cat3", new Cat("CatName3"));
        map.put("Cat4", new Cat("CatName4"));
        map.put("Cat5", new Cat("CatName5"));
        map.put("Cat6", new Cat("CatName6"));
        map.put("Cat7", new Cat("CatName7"));
        map.put("Cat8", new Cat("CatName8"));
        map.put("Cat9", new Cat("CatName9"));
        map.put("Cat10", new Cat("CatName10"));
        //напишите тут ваш код
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();

        set.add(map.get("Cat1"));
        set.add(map.get("Cat2"));
        set.add(map.get("Cat3"));
        set.add(map.get("Cat4"));
        set.add(map.get("Cat5"));
        set.add(map.get("Cat6"));
        set.add(map.get("Cat7"));
        set.add(map.get("Cat8"));
        set.add(map.get("Cat9"));
        set.add(map.get("Cat10"));
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
