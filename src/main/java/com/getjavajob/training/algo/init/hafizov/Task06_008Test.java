package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task06_008Test {
    public static void main(String[] args) {
        testNumber();
    }

    public static void testNumber() {
        Assert.assertEquals("1 4 9 16 25 36 49", Task06_008.numberN(50));
    }
}
