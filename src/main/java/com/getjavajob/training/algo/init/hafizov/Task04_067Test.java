package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task04_067Test {
    public static void main(String[] args) {
        testWeekend1();
        testWeekend2();
    }

    public static void testWeekend1() {
        Assert.assertEquals("Workday", Task04_067.weekend(5));
    }

    public static void testWeekend2() {
        Assert.assertEquals("weekend", Task04_067.weekend(7));
    }
}
