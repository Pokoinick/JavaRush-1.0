package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try {
            float i = 1 / 0;
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] i = new int[5];
            System.out.println(i[5]);
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            InputStream inputStream = new FileInputStream("Nan");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();
        }
        catch (Exception e){
            exceptions.add(e);
        }
        try {
            int[] i = new int[-1];
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String s = "";
            s.charAt(55);
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NullPointerException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NotSerializableException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchMethodException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        //Add your code here

    }
}
