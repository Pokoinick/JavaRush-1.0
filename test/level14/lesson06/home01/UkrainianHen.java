package com.javarush.test.level14.lesson06.home01;


/**
 * Created by Станислав on 14.01.2017.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 50;
    }

    public String getDescription()
    {
        return super.getDescription()+" Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
