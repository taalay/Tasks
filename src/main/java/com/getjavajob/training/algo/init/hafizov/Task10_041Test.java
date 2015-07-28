package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task10_041Test {
    public static void main(String[] args) {
        testFactorial();
    }

    public static void testFactorial() {
        Assert.assertEquals(1307674368000l, Task10_041.factorial(15));
    }
}
