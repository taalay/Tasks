package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_042Test {
    public static void main(String[] args) {
        testReverse();
    }

    public static void testReverse() {
        Assert.assertEquals("olleh", Task09_042.reverseS("hello"));
    }
}
