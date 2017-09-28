package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

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

        if (args[0].equals("-d")) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileCrUD), "cp1251"));
            for (int i = 0; i < arrayList.size(); i++) {
                String s = arrayList.get(i);
                s = s.substring(0, 8);
                if (s.contains(" "))
                    s = s.substring(0, s.indexOf(' '));
                if (Integer.parseInt(s) == Integer.parseInt(args[1]))
                    arrayList.remove(i);
            }
            for (String data: arrayList)
            {
                bw.write(data);
            }
            bw.flush();
            bw.close();
        }

        if (args[0].equals("-u")){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileCrUD), "cp1251"));
            String id = args[1];
            int length = 8-id.length();
            if (id.length()<8){
                for (int i = 0; i < length; i++)
                {
                    id +=" ";
                }
            }
            String result = id+productname(args[2])+price(args[3])+quantity(args[4])+"\n";
            for (int i = 0; i < arrayList.size(); i++)
            {
                String s = arrayList.get(i);
                s = s.substring(0, 8);
                if (s.contains(" "))
                    s = s.substring(0, s.indexOf(' '));
                if (Integer.parseInt(s) == Integer.parseInt(args[1]))
                    arrayList.set(i, result);
            }
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
