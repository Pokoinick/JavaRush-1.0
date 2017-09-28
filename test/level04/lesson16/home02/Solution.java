package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        String bs = reader.readLine();
        String cs = reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);
        if(a<b && a>c || a<c && a>b)
            System.out.println(a);
        if(c<a && c>b || c>a && c<b)
            System.out.println(c);
        if(b<a && b>c || b>a && b<c)
            System.out.println(b);
    }
}
