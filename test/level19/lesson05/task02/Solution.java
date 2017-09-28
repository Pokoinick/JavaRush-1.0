package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        String[] test;
        int counter = 0;
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            data = data.replaceAll("\\p{Punct}|Blank|\\\\s"," ");
            test = data.split(" ");
            for (String a : test)
            {
                if (a.equals("world"))
                    counter++;
            }
        }
        System.out.println(counter);
        reader.close();
        scanner.close();
    }
}
