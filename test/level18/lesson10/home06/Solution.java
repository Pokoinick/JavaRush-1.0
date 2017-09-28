package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new FileReader(args[0]);
        ArrayList<Integer> symbols = new ArrayList<>();
        int[] frequency = new int[256];

        while (inputStreamReader.ready()) {
            int a = inputStreamReader.read();
            if (symbols.contains(a))
                ++frequency[a];
            else {
                symbols.add(a);
                ++frequency[a];
            }
        }

        for (int i : symbols)
        {
            for (int j = 0; j < symbols.size()-1; j++)
            {
                if (symbols.get(j)>symbols.get(j+1)){
                    int tmp =symbols.get(j);
                    symbols.set(j, symbols.get(j+1));
                    symbols.set(j+1, tmp);
                }
            }
        }
        for (int i = 0; i < symbols.size(); i++)
        {
            int cha = symbols.get(i);
            System.out.println((char)cha+" "+frequency[symbols.get(i)]);
        }

        inputStreamReader.close();
    }
}
