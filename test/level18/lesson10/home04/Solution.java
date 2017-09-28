package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inputStream = new FileInputStream(fileName);
        InputStream inputStream1 = new FileInputStream(reader.readLine());
        reader.close();


        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available()>0) {
            inputStream.read(buffer);
        }
        inputStream.close();


        OutputStream outputStream = new FileOutputStream(fileName);
        while (inputStream1.available()>0) {
            int data = inputStream1.read();
            outputStream.write(data);
        }
        inputStream1.close();

        outputStream.write(buffer);

        outputStream.flush();
        outputStream.close();

    }
}
