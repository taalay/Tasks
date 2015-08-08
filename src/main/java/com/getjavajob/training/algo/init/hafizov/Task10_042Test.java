package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task10_042Test {
    public static void main(String[] args) {
        testOdd();
    }

    public static void testOdd() {
        Assert.assertEquals(100.0, Task10_042.toOdd(10, 2));
    }
}
