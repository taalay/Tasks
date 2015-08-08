package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 22.07.2015.
 */
public class Task13_012Test {
    public static void main(String[] args) {
        Task13_012.init();//инициация сотрудников
        testUniversalFinder();
        testHowYearsWorked();
        testWorkedOver3Years();
    }

    public static void testUniversalFinder() {
        Assert.assertEquals("Olga Komkova Andreevna", Task13_012.find("mKov"));
        Assert.assertEquals("Olga Komkova Andreevna", Task13_012.find("Andreevna"));
        Assert.assertEquals("Olga Komkova Andreevna", Task13_012.find("Olga"));
    }

    public static void testHowYearsWorked() {
        Assert.assertEquals(5, Task13_012.getWorkedYears(07, 2015, "ivanov"));
    }

    public static void testWorkedOver3Years() {
        String result = "Ivan Ivanov, Artem Juravlev, Pavel Semenov, Volia Babanov,";
        Assert.assertEquals(result, Task13_012.printEm(07, 2015));
    }
}
