package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        FileWriter fileWriter = new FileWriter(reader.readLine());
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(" ");
            for (String s: data)
            {
                boolean isDigit = false;
                for (int i = 0; i < s.length(); i++)
                {
                    if (Character.isDigit(s.charAt(i)))
                        isDigit = true;
                    else
                    {
                        isDigit = false;
                        break;
                    }
                }
                if (isDigit)
                    fileWriter.write(s+" ");
            }

        }
        reader.close();
        scanner.close();
        fileWriter.flush();
        fileWriter.close();

    }
}
