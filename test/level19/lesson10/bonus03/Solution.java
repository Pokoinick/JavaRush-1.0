package com.javarush.test.level19.lesson10.bonus03;

/* Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>
Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги
Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        reader.close();

        StringBuilder sb = new StringBuilder();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        while (fileReader.ready()) {
            sb.append(fileReader.readLine());
        }
        String text = sb.toString();
        separateTag(text, args[0]);
    }

    public static void separateTag(String text, String tag) {
        String close = "</" + tag + ">";
        Pattern p = Pattern.compile("<" + tag + "[^>]*+>" + "|" + close);
        int indexStart = 0, indexEnd = 0, result = -1;
        Map<Integer, Integer> mapStart = new TreeMap<>();

        Matcher m =  p.matcher(text);
        while (m.find()) {
            if (!m.group().equals(close)) mapStart.put(++indexStart, m.start());
            else if(indexStart > 0) indexEnd++;
            result = indexStart - indexEnd;
            if (result == 0 && indexStart != 0) {
                System.out.println(text.substring(mapStart.get(1), m.end()));
                String sub = text.substring(mapStart.get(1)+m.group().length()-1, m.end()-close.length());
                separateTag(sub, tag);
                indexEnd = 0; indexStart = 0;
            }
        }
        if (result > 0){
            System.out.println(text.substring(mapStart.get(1+result), text.lastIndexOf(close)+close.length()));
            separateTag(text.substring(mapStart.get(1+result)+m.group().length()-1), tag);
        }
    }
}
