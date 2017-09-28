package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        int number = 0;
        ArrayList<String> arr = new ArrayList<>();
        arr.add("January");
        arr.add("February");
        arr.add("March");
        arr.add("April");
        arr.add("May");
        arr.add("June");
        arr.add("July");
        arr.add("August");
        arr.add("September");
        arr.add("October");
        arr.add("November");
        arr.add("December");
        for (int i = 0; i < arr.size(); i++)
        {
            if (month.equals(arr.get(i)))
                number = i+1;
        }
        System.out.println(month + " is " + number + " month");
    }

}
