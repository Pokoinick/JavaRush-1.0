package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        //::CODE:
        if (mount > 3)
            if(mount >11)
                System.out.println("зима");
            else;
        else
            System.out.println("зима");
        if (mount > 2)
            if(mount < 6)
                System.out.println("весна");
            else;
        else ;
        if (mount > 5)
            if(mount < 9)
                System.out.println("лето");
            else;
        else ;
        if (mount > 8)
            if(mount < 12)
                System.out.println("осень");
            else;
        else ;


    }
}