package com.javarush.test.level14.lesson08.bonus03;


/**
 * Created by Станислав on 15.01.2017.
 */
public  class Singleton
{
    private Singleton() {
    }
    private static Singleton singleton = null;

    static Singleton getInstance(){
        if (singleton == null)
            return singleton = new Singleton();
        return singleton;
    }
}
