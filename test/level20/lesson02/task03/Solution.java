package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.*;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();


    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try
        {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
            consoleReader.close();

            Properties properties = new Properties();
            properties.load(fileReader);
            fileReader.close();
            for (Map.Entry map : properties.entrySet())
            {
                Solution.properties.put(map.getKey().toString(), map.getValue().toString());
            }
        } catch (Exception e) {}

//
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties properties = new Properties();
        properties.putAll(Solution.properties);
        properties.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry map: properties.entrySet())
        {
            Solution.properties.put(map.getKey().toString(),map.getValue().toString());
        }
        //implement this method - реализуйте этот метод
    }
}
