package com.javarush.test.level19.lesson03.task04;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("D:/first.txt"),"cp1251");
        PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);

        System.out.println(adapter.read().toString());
        adapter.close();
    }
    public static class PersonScannerAdapter implements PersonScanner {
        Scanner scanner;
        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            Person person;
            String[] a = scanner.nextLine().split(" ");

            person = new Person(a[1], a[2], a[0], new GregorianCalendar(Integer.parseInt(a[5]),Integer.parseInt(a[4])-1,Integer.parseInt(a[3])).getTime());
            return person;
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}
