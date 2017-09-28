package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        int sum = 0;
        while (i != -1){
            String s = reader.readLine();
            i = Integer.parseInt(s);
            sum =sum+i;
            if(i == -1) {
                System.out.println(sum);
                break;
            }
        }
    }
}
