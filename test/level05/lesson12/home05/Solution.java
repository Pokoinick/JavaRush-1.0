package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int summ = 0;
        while(true)
        {
            s = reader.readLine();
            if (s.equals("сумма")) {
                System.out.println(summ);
                break;

            }
            else
            {
                summ = summ + Integer.parseInt(s);
            }

        }
    }
}
