package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        FileWriter fileWriter = new FileWriter(reader.readLine());

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            s = s.replace('.','!');
            fileWriter.write(s);
        }
        reader.close();
        scanner.close();
        fileWriter.flush();
        fileWriter.close();
    }
}
