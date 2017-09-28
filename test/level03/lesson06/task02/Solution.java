package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static String qwe(int input)
    {
        int a1 = 1*input;
        int a2 = 2*input;
        int a3 = 3*input;
        int a4 = 4*input;
        int a5 = 5*input;
        int a6 = 6*input;
        int a7 = 7*input;
        int a8 = 8*input;
        int a9 = 9*input;
        int a10 = 10*input;
        String x = a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6+" "+a7+" "+a8+" "+a9+" "+a10;
        return x;
    }
    public static void main(String[] args)
    {
        //напишите тут ваш код

        System.out.println(qwe(1));
        System.out.println(qwe(2));
        System.out.println(qwe(3));
        System.out.println(qwe(4));
        System.out.println(qwe(5));
        System.out.println(qwe(6));
        System.out.println(qwe(7));
        System.out.println(qwe(8));
        System.out.println(qwe(9));
        System.out.println(qwe(10));


    }
}