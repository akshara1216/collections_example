package com.collections.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;


public class RandomDOB {

    private static  LocalDate randomDOB = null;


    public static LocalDate generateDOB()
    {
        return randomDOB = LocalDate.now().minus(Period.ofDays(new Random().nextInt(365*50)));
    }
    @Override
    public String toString() {
        return "RandomDOB{}+ randomDOB";
    }
}
