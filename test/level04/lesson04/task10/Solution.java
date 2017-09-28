package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 =  reader.readLine();
        int a = Integer.parseInt(number1);

        String number2 =  reader.readLine();
        int b = Integer.parseInt(number2);

        String number3 =  reader.readLine();
        int c = Integer.parseInt(number3);
        int x;

        if (a==b && b==c && a==c)
        {
            System.out.println(a+" "+b+" "+ c);
        }
        else if((a==b)&&(c!=a)&&(c!=b))
        {
            System.out.println(a+" "+b);
        }
        else if ((a==c)&&(b!=a)&&(b!=c))
        {
            System.out.println(a + " " + c);
        }
        else if ((b==c)&&(a!=c)&&(a!=b))
        {
            System.out.println(b + " " + c);
        }
  /*      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        int a = Integer.parseInt(as);
        String bs = reader.readLine();
        int b = Integer.parseInt(bs);
        String cs = reader.readLine();
        int c = Integer.parseInt(cs);
        //напишите тут ваш код
        if(a == b && b == c)
            System.out.println(a+" "+b+" "+c);
        else
        {
            if (a == b && b != c && a !=c)
                System.out.println(a + " + " + b);
            else ;
            if (a != b && b == c && a !=c)
                System.out.println(b + " + " + c);
            else ;
            if (a != b && b != c && a == c)
                System.out.println(a + " " + c);
            else ;
        }
        */

    }
}