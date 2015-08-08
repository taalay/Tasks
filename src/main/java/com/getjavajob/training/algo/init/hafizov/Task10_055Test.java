package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_055Test {
    public static void main(String[] args) {
        testTransfer();
    }

    public static void testTransfer() {
        Assert.assertEquals("100011", Task10_055.transfer(35, 2));
    }
}
