package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        int a = Integer.parseInt(as);
        String bs = reader.readLine();
        int b = Integer.parseInt(bs);
        String cs = reader.readLine();
        int c = Integer.parseInt(cs);
        //напишите тут ваш код
        int an = max(a,b,c);
        int bn = middle(a,b,c);
        int cn = min(a,b,c);
        System.out.println(an+" "+ bn +" "+ cn);
    }
    public static int max(int a, int b, int c){
        if(a>=b && a>=c)
            return a;
        else
            if (b>=a && b>=c)
                return b;
            else
                return  c;
    }
    public static int middle(int a, int b, int c)
    {
            if(a<=b && a>=c || a>=b && a<=c)
                return a;
            else
            if (b<=a && b>=c || b>=a && b<=c)
                return b;
            else
                return  c;

    }
    public static int min(int a, int b, int c)
    {
        if(a<=b && a<=c)
            return a;
        else
        if (b<=a && b<=c)
            return b;
        else
            return  c;
    }
}
