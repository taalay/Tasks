package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task10_045Test {
    public static void main(String[] args) {
        testNumRoot();
        testGetSum();
    }

    public static void testNumRoot() {
        Assert.assertEquals(298, Task10_045.getN(1, 3, 100));
    }

    public static void testGetSum() {
        Assert.assertEquals(14950, Task10_045.getSum(1, 3, 100));
    }
}
