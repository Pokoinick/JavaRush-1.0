package com.javarush.test.level14.lesson06.home01;


/**
 * Created by Станислав on 14.01.2017.
 */
public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 100;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
