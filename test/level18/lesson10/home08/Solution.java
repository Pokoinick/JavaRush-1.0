package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while (!(a = reader.readLine()).equals("exit"))
        {
            new ReadThread(a).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread  {
        String filename;
        public ReadThread(String fileName) {
            this.filename = fileName;
        }

        @Override
        public void run()
        {
            int[] repeats = new int[256];
            InputStream inputStream = null;
            try
            {
                inputStream = new FileInputStream(filename);
                while (inputStream.available()>0) {
                    int data = inputStream.read();
                    repeats[data]++;
                }
                inputStream.close();
            } catch (IOException e) {}


            int maxFrequency = 0;
            int max = 0;
            for (int i = 0; i < repeats.length; i++)
            {
                if (repeats[i]>maxFrequency) {
                    maxFrequency = repeats[i];
                    max = i;
                }
            }
            System.out.println(filename+ " "+ max);
            resultMap.put(filename,max);
        }
    }
}
