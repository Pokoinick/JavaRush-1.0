package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Станислав on 17.01.2017.
 */
public class SubSolution extends Solution
{
    SubSolution() {}

    SubSolution(int i)
    {
        super(i);
    }

    SubSolution(String s)
    {
        super(s);
    }

    protected SubSolution(double d)
    {
        super(d);
    }

    protected SubSolution(boolean b)
    {
        super(b);
    }

    protected SubSolution(char c)
    {
        super(c);
    }

    public SubSolution(Object o)
    {
        super(o);
    }

    public SubSolution(Integer i)
    {
        super(i);
    }

    public SubSolution(byte b)
    {
        super(b);
    }

    private SubSolution(short s) {}
    private SubSolution(Double d) {}
    private SubSolution(Character c) {}
}
