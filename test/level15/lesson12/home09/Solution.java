package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String uRL = reader.readLine();
        uRL = uRL.substring(uRL.indexOf('?')+1);
        String[] s = uRL.split("&");
        String[] obj = uRL.split("&");

        for (int i = 0; i < s.length; i++)
        {
            if (obj[i].contains("="))
                obj[i] = obj[i].substring(0, obj[i].indexOf("="));
            System.out.print(obj[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].contains("obj"))
                if (s[i].substring(0,s[i].indexOf('=')).equals("obj"))
                    try
                    {
                        alert(Double.parseDouble(s[i].substring(s[i].indexOf("=") + 1)));
                    } catch (NumberFormatException e) {
                        if (s[i].substring(s[i].indexOf("=") + 1, s[i].length()).contains("="))
                            alert(s[i].substring(s[i].indexOf("=") + 1, s[i].lastIndexOf("=")));
                        else
                            alert(s[i].substring(s[i].indexOf("=") + 1));
                    }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
