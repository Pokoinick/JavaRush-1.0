package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine(), true);
        InputStream inputStreamFile2 = new FileInputStream(reader.readLine());
        InputStream inputStreamFile3 = new FileInputStream(reader.readLine());

        while (inputStreamFile2.available()>0) {
            int data = inputStreamFile2.read();
            outputStream.write(data);
        }
        while (inputStreamFile3.available()>0) {
            int data = inputStreamFile3.read();
            outputStream.write(data);
        }

        reader.close();
        outputStream.flush();
        outputStream.close();
        inputStreamFile2.close();
        inputStreamFile3.close();

    }
}
