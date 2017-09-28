package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        TreeMap<String, Double> map = new TreeMap<>();
        ArrayList<String> richest = new ArrayList<>();
        double compare = 0;

        while (fileReader.ready()) {
            String[] dataString = fileReader.readLine().split(" ");
            String name = dataString[0];
            double value = Double.parseDouble(dataString[1]);
            if (map.containsKey(name))
                value += map.get(name);
            map.put(name, value);
        }
        fileReader.close();

        for (Map.Entry<String, Double> test: map.entrySet())
        {
            if (test.getValue() >= compare) {
                if (test.getValue() > compare)
                    richest.clear();
                compare = test.getValue();
                richest.add(test.getKey());
            }
        }

        for (String s: richest)
        {
            System.out.println(s);
        }


    }
}
