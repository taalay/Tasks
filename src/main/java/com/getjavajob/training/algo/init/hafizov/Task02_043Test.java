package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task02_043Test {
    public static void main(String[] args) {
        testShare();
        testNoShare();
    }

    public static void testShare() {
        Assert.assertEquals(1, Task02_043.noIf(300, 600));
    }

    public static void testNoShare() {
        Assert.assertEquals(20001, Task02_043.noIf(200, 500));
    }
}
