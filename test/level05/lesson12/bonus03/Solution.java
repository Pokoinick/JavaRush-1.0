package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int number = Integer.parseInt(reader.readLine()) ;
        if (number<0)
        {
            //    System.out.println("Invalid number");
        }
        else {
            for(int i = 0; i<number; i++) {
                int iteration = Integer.parseInt(reader.readLine());
                if(i<1)
                    maximum = iteration;
                if(iteration>maximum)
                    maximum = iteration;
            }

        }
        System.out.println(maximum);
    }
}
