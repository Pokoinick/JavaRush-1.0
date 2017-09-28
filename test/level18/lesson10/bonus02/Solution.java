package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileCrUD = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileCrUD), "cp1251"));
        String fileString;

        while ((fileString = br.readLine()) != null) {
            arrayList.add(fileString+"\n");
        }

        br.close();

        if (args[0].equals("-c")){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileCrUD), "cp1251"));
            String result = id()+productname(args[1])+price(args[2])+quantity(args[3])+"\n";
            arrayList.add(result);
            for (String s: arrayList)
            {
                bw.write(s);
            }
            bw.flush();
            bw.close();
        }
    }

    private static String quantity(String quantity)
    {
        if (quantity.length()>4)
            quantity = quantity.substring(0,4);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(quantity);

        int length = 4-stringBuilder.length();
        if (stringBuilder.length()<4){
            for (int i = 0; i < length; i++)
            {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private static String price(String price)
    {
        if (price.length()>8)
            price = price.substring(0,8);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(price);

        int length = 8-stringBuilder.length();
        if (stringBuilder.length()<8){
            for (int i = 0; i < length; i++)
            {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private static String productname(String name)
    {
        if (name.length()>30)
            name = name.substring(0,30);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);

        int length = 30-stringBuilder.length();
        if (stringBuilder.length()<30){
            for (int i = 0; i < length; i++)
            {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static String id () {
        StringBuilder stringBuilder = new StringBuilder();
        int id = 1;
        for (String i: arrayList)
        {
            i = i.substring(0, 8);
            if (i.contains(" "))
                i = i.substring(0, i.indexOf(' '));
            if (Integer.parseInt(i) >= id)
                id = Integer.parseInt(i)+1;
        }
        stringBuilder.append(id);

        int length = 8-stringBuilder.length();
        if (stringBuilder.length()<8){
            for (int i = 0; i < length; i++)
            {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
