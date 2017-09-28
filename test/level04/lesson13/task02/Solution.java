package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

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

        for(int i = 0; i<a; i++) {
            for(int k = 0; k<b; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
