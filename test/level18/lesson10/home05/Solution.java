package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(new InputStreamReader(new FileInputStream(reader.readLine())));
        PrintStream printStream = new PrintStream(new FileOutputStream(reader.readLine()));
        String result = "";
        double d;
        while (scanner.hasNextDouble()) {
            d = scanner.nextDouble();
            d = Math.round(d);
            result +=(int)d + " ";
        }
        printStream.write(result.getBytes());
        System.out.println(result);

        reader.close();
        scanner.close();
        printStream.flush();
        printStream.close();
    }
}
