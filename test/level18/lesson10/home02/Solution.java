package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new FileReader(args[0]);
        int symbolsCount = 0;
        int spacesCount = 0;
        while (inputStreamReader.ready()) {
            int data = inputStreamReader.read();
            if (data == ' ')
                spacesCount++;
            symbolsCount++;
        }
        inputStreamReader.close();

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        float result = ((float)spacesCount/symbolsCount)*100;
        System.out.println(numberFormat.format(result));

    }
}
