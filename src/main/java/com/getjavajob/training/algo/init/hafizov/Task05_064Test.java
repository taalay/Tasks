package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task05_064Test {
    public static void main(String[] args) {
        testResidents();
    }

    public static void testResidents() {
        int[] people = {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
        int[] km = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Assert.assertEquals(120000, Task05_064.residents(people, km));
    }
}

