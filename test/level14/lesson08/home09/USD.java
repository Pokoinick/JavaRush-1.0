package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Станислав on 15.01.2017.
 */
public class USD extends Money
{

     USD(double amount)
    {
        super(amount);
    }
    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
