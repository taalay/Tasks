package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_022Test {
    public static void main(String[] args) {
        testSplit();
        testSplit2();
    }

    public static void testSplit() {
        Assert.assertEquals("au", Task09_022.splitStr("auto"));
    }

    public static void testSplit2() {
        Assert.assertEquals("Not odd", Task09_022.splitStr("hello"));
    }
}
