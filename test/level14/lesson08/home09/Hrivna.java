package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Станислав on 14.01.2017.
 */
public class Hrivna extends Money
{

    Hrivna(double amount)
    {
        super(amount);
    }
    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
