package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        int a = Integer.parseInt(as);
        String bs = reader.readLine();
        int b = Integer.parseInt(bs);
        String cs = reader.readLine();
        int c = Integer.parseInt(cs);
        String ds = reader.readLine();
        int d = Integer.parseInt(ds);
        if(a>=b && a>=c && a>=d)
            System.out.println(a);
        else;
        if(b>=a && b>=c && b>=d)
            System.out.println(b);
        else;
        if(c>=a && c>=b && c>=d)
            System.out.println(c);
        else;
        if(d>=a && d>=c && d>=b)
        System.out.println(d);
        else;

    }
}
