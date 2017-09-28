package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        String bs = reader.readLine();
        String cs = reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);
        int a1 = positive(a, b, c);
        int b1 = negative(a, b, c);
        System.out.println("количество отрицательных чисел: " + b1);
        System.out.println("количество положительных чисел: " + a1);
    }


        private static int positive(int a, int b, int c){
            int i;
            if(a>0 && b>0 && c>0)
                i = 3;
            else
                if(a>0 && b>0 || a>0 && c>0 || b>0 && c>0)
                    i = 2;
                else
                    if(a>0 || b>0 || c>0)
                        i = 1;
                    else
                        i=0;
            return i;
        }
        private static int negative(int a, int b, int c) {
            int i;
            if(a<0 && b<0 && c<0)
                i = 3;
            else
                if(a<0 && b<0 || a<0 && c<0 || b<0 && c<0)
                     i = 2;
                else
                     if(a<0 || b<0 || c<0)
                         i = 1;
                     else
                         i=0;
            return i;
         }
}
