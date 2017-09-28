package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double money;
    public Money(){

    }

    public Money(double amount)
    {
        money = amount;
    }

    public double getAmount() {
        return this.money;
    }

    public abstract String getCurrencyName();
}

