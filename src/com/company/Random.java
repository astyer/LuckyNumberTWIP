package com.company;

public class Random {

    public Random(String a)
    {

    }

    public int perfectRandom(int x)
    {
        x = (int)(Math.random() * 46000);
        x = x * x;
        return x;
    }
}
