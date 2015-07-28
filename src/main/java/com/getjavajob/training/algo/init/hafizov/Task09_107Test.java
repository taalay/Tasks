package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_107Test {
    public static void main(String[] args) {
        testMoveAO();
        testMoveAO2();
    }

    public static void testMoveAO() {
        Assert.assertEquals("Joc hella my friend", Task09_107.removeAO("Jac hello my friend"));
    }

    public static void testMoveAO2() {
        Assert.assertEquals("a and o not found", Task09_107.removeAO("hello my friend"));
    }
}
