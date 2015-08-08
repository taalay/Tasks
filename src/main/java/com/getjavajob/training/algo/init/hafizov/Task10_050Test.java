package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_050Test {
    public static void main(String[] args) {
        testAckerman();
    }

    public static void testAckerman() {
        Assert.assertEquals(5, Task10_050.ackerman(1, 3));
    }
}
