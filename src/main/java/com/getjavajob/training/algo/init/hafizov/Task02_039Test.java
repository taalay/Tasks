package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task02_039Test {
    public static void main(String[] args) {
        testDegree();
    }

    public static void testDegree() {
        Assert.assertEquals(284, Task02_039.getDegree(18, 59, 59));
    }
}
