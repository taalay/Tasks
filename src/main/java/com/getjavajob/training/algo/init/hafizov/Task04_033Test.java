package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task04_033Test {
    public static void main(String[] args) {
        testEven();
        testOdd();
    }

    public static void testEven() {
        Assert.assertEquals(true, Task04_033.isEven(12));
    }

    public static void testOdd() {
        Assert.assertEquals(false, Task04_033.isEven(7));
    }
}
