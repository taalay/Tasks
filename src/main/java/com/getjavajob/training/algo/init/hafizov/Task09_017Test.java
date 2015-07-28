package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_017Test {
    public static void main(String[] args) {
        testIdenTrue();
        testIdenFalse();
    }

    public static void testIdenTrue() {
        Assert.assertEquals(true, Task09_017.iden("sisters"));
    }

    public static void testIdenFalse() {
        Assert.assertEquals(false, Task09_017.iden("hello"));
    }
}
