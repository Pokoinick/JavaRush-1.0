package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("Son1", true, 15, new ArrayList<Human>());
        Human child2 = new Human("Doughter1", false, 18, new ArrayList<Human>());
        Human child3 = new Human("Doughter2", false, 13, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("Father", true, 33, children);
        Human mother = new Human("Mother", false, 28, children);
        ArrayList<Human> parent1 = new ArrayList<>();
        ArrayList<Human> parent2 = new ArrayList<>();
        parent1.add(father);
        parent2.add(mother);
        Human gFather1 = new Human("Grand Father", true, 33, parent1);
        Human gMother1 = new Human("Grand Mother", false, 28, parent1);
        Human gFather2 = new Human("Grand Father", true, 33, parent2);
        Human gMother2 = new Human("Grand Mother", false, 28, parent2);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
