package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task05_038Test {
    public static void main(String[] args) {
        testHusband();
    }

    public static void testHusband() {
        Assert.assertEquals("Distance from home= 0.6881718. The total distance traveled= 5.187378", Task05_038.husband(100));
    }
}
