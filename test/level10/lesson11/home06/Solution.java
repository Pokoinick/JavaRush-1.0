package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String adres;
        boolean sex;
        int age;
        Human parents;
        Human childrens;

        Human() {
        }

        Human (int age) {
            this.age = age;
        }

        Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        Human(int age, String name, String adres) {
            this.age = age;
            this.name = name;
            this.adres = adres;
        }

        Human(int age, String name, String adres, boolean sex) {
            this.age = age;
            this.name = name;
            this.adres = adres;
            this.sex = sex;
        }

        Human(int age, String name, String adres, boolean sex, Human parents) {
            this.age = age;
            this.name = name;
            this.adres = adres;
            this.sex = sex;
            this.parents = parents;
        }

        Human(int age, String name, String adres, boolean sex, Human parents, Human childrens) {
            this.age = age;
            this.name = name;
            this.adres = adres;
            this.sex = sex;
            this.parents = parents;
            this.childrens = childrens;
        }

        Human(String name, String adres, boolean sex, Human childrens) {
            this.name = name;
            this.adres = adres;
            this.sex = sex;
            this.childrens = childrens;
        }

        Human(int age, String name, boolean sex, Human parents, Human childrens) {
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.parents = parents;
            this.childrens = childrens;
        }

        Human(int age, String name, String adres, Human parents, Human childrens) {
            this.age = age;
            this.name = name;
            this.adres = adres;
            this.parents = parents;
            this.childrens = childrens;
        }
    }
}
