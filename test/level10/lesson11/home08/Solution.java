package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        arrayOfStringList[0] = new ArrayList<>();
        arrayOfStringList[1] = new ArrayList<>();
        arrayOfStringList[2] = new ArrayList<>();
        arrayOfStringList[0].add("dadada");
        arrayOfStringList[0].add("dadada");
        arrayOfStringList[0].add("dadada");
        arrayOfStringList[1].add("dadada");
        arrayOfStringList[1].add("dadada");
        arrayOfStringList[2].add("dadada");

        //напишите тут ваш код

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}