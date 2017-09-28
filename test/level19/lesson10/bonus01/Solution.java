package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(consoleReader.readLine())));
        BufferedReader fileReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(consoleReader.readLine())));
        consoleReader.close();
        List<String> file1List = new ArrayList<>();
        List<String> file2List = new ArrayList<>();

        while (fileReader1.ready()) {
            String file1String = fileReader1.readLine();
            file1List.add(file1String);
        }
        while (fileReader2.ready()) {
            String file2String = fileReader2.readLine();
            file2List.add(file2String);
        }

        fileReader1.close();
        fileReader2.close();


        if (file1List.isEmpty() || file2List.isEmpty())
        {
            if (file1List.isEmpty())
            {
                lines.add(new LineItem(Type.ADDED, file2List.get(0)));
            } else
                lines.add(new LineItem(Type.REMOVED, file1List.get(0)));
        }

        while (!(file1List.size() == file2List.size())) {
            if (file1List.size()>file2List.size())
                file2List.add("");
            else
                file1List.add("");
        }


        for (int i = 0; i < file1List.size(); i++)
        {
            if (file1List.size() == i || file2List.size() == i)
                break;
            if (file1List.get(i).equals(file2List.get(i))) {
                lines.add(new LineItem(Type.SAME, file1List.get(i)));
            }
            else if(file1List.get(i).equals("")||file2List.get(i).equals(""))
                if (file1List.get(i).equals(""))
                    lines.add(new LineItem(Type.ADDED, file2List.get(i)));
                else
                    lines.add(new LineItem(Type.REMOVED, file1List.get(i)));
            else if (file1List.get(i).equals(file2List.get(i+1))) {
                lines.add(new LineItem(Type.ADDED, file2List.get(i)));
                file1List.add(i, "");
            }
            else {
                lines.add(new LineItem(Type.REMOVED, file1List.get(i)));
                file2List.add(i,"");
            }
            if (lines.size()>1)
                if (lines.get(i).type.equals(lines.get(i-1).type) && !lines.get(i).type.equals(Type.SAME)) {
                    lines.remove(i);
                    break;
                }

        }

        for (LineItem line: lines)
        {
            System.out.println(line.type+" "+line.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
