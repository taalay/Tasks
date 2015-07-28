package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 22.07.2015.
 */
public class Task13_012Test {
    public static void main(String[] args) {
        Task13_012.init();//��������� �����������
        testFindByString();
        testHowYearsWorked();
        testWorkedOver3Years();
    }

    public static void testFindByString() {
        Assert.assertEquals("Olga Komkova", Task13_012.find("mKov"));
    }

    public static void testHowYearsWorked() {
        Assert.assertEquals(5, Task13_012.getWorkedYears(07, 2015, "ivanov"));
    }

    public static void testWorkedOver3Years() {
        String result = "Ivan Ivanov Artem Juravlev Pavel Semenov";
        Assert.assertEquals(result, Task13_012.printEm(07, 2015));
    }
}
