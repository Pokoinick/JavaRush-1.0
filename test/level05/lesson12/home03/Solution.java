package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tom = new Cat("Tom", 12, 23);
        Dog wuf = new Dog("Wuf", 234, 29);

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int weight;
        int speed;

        Cat(String name, int weight, int speed) {
            this.name = name;
            this.weight = weight;
            this.speed = speed;
        }
    }

    public static class Dog {
        String name;
        int strenght;
        int weight;

        Dog(String name, int strenght, int weight) {
            this.name = name;
            this.strenght = strenght;
            this.weight = weight;
        }
    }


    //добавьте тут ваши классы

}
