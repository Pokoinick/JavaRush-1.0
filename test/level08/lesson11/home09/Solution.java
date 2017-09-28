package com.javarush.test.level08.lesson11.home09;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }
    public static boolean isDateOdd(String date)
    {
        Date newYear = new Date();
        newYear.setMonth(0);
        newYear.setDate(0);
        Date nowDate = new Date(date);
        long timeDistance = nowDate.getTime()- newYear.getTime();
        long msDay = 24*60*60*1000;
        int dayCount = (int)(timeDistance/msDay);
        return dayCount%2 != 0;
    }
}