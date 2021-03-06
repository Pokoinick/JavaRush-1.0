package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        FileOutputStream fileWriter1 = new FileOutputStream(reader.readLine());
        FileOutputStream fileWriter2 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fileReader.available()];
        int count = fileReader.read(buffer);
        if (buffer.length %2 == 0) {
            fileWriter1.write(buffer, 0, count/2);
            fileWriter2.write(buffer, count/2, count/2);
        } else {
            fileWriter1.write(buffer, 0, count/2+1);
            fileWriter2.write(buffer, count/2, count/2);
        }
        reader.close();
        fileReader.close();
        fileWriter1.close();
        fileWriter2.close();
    }
}
