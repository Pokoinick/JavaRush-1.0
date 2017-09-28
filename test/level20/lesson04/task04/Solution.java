package com.javarush.test.level20.lesson04.task04;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Как сериализовать static?
Сделайте так, чтобы сериализация класса ClassWithStatic была возможной
*/
public class Solution
{
    public static class ClassWithStatic implements Serializable {
        public static String  staticString  = "it's test static string";
        public int i;
        public int j;

        public static void serializeObject(ObjectOutputStream oos)  {
            try
            {
                oos.writeChars(staticString);
            } catch (Exception e) {}
        }
        public static void deserializeObject(ObjectInputStream ois) {
            try
            {
                staticString = ois.readLine();
            } catch (Exception e) {}
        }
    }
}
