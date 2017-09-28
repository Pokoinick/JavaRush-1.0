package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileNames = new ArrayList<>();
        String filename;
        while (!(filename = reader.readLine()).equals("end")) {
            fileNames.add(filename);
        }
        reader.close();
        for (String s: fileNames)
        {
            for (int i = 0; i < fileNames.size() - 1; i++)
            {
                if (fileNames.get(i).compareTo(fileNames.get(i + 1)) > 0)
                {
                    String temp = fileNames.get(i);
                    fileNames.set(i, fileNames.get(i + 1));
                    fileNames.set(i + 1, temp);
                }
            }
        }
        String header = fileNames.get(0);
        header = header.substring(0, header.lastIndexOf('.'));
        OutputStream outputStream = new FileOutputStream(header, true);

        for (int i = 0; i < fileNames.size(); i++)
        {
            InputStream inputStream = new FileInputStream(fileNames.get(i));
            byte[] arr = new byte[inputStream.available()];
            while (inputStream.available()>0) {
                inputStream.read(arr);
                outputStream.write(arr);
            }
            inputStream.close();
        }
        outputStream.flush();
        outputStream.close();

    }
}
