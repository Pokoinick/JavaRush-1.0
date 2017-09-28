package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new FileReader(args[0]);
        int counter = 0;
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        while (inputStream.ready()) {
            int data = inputStream.read();
            for (char c: alphabet)
            {
                if (c == data)
                    counter++;
            }
        }
        System.out.println(counter);
        inputStream.close();

    }
}
