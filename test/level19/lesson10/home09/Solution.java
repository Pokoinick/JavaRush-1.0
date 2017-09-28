package com.javarush.test.level19.lesson10.home09;

/* Контекстная реклама
В методе main подмените объект System.out написанной вами реадер-оберткой
Ваша реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultOut = System.out;

        ByteArrayOutputStream storeOut = new ByteArrayOutputStream();
        PrintStream customOut = new PrintStream(storeOut);
        System.setOut(customOut);

        testString.printSomething();

        System.setOut(defaultOut);

        String[] s = storeOut.toString().split("\\n");
        int count = 0;
        for (String a: s)
        {
            count++;
            if (count == 2)
            {
                a += "\nJavaRush - курсы Java онлайн";
                count = 0;
            }
            System.out.println(a);
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
