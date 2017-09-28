package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String name = line.replaceAll("[\\d]", "").trim();
            String birth[] = line.replaceAll("[^\\d]"," ").trim().split(" ");
            Date date = new Date();
            try
            {
                date = new SimpleDateFormat("dd MM yyyy").parse(birth[0]+" "+birth[1]+" "+birth[2]);
            } catch (ParseException e) {
                e.getMessage();
            }

            System.out.println(name);

            PEOPLE.add(new Person(name, date));
        }
        fileReader.close();

        for (Person person: PEOPLE)
        {
            System.out.println(person.getName()+" "+person.getBirthday());
        }
    }

}
