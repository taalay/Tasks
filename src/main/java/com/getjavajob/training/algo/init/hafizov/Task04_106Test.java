package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task04_106Test {
    public static void main(String[] args) {
        testSeason1();
        testSeason2();
        testSeason3();
        testSeason4();
    }

    public static void testSeason1() {
        Assert.assertEquals("winter", Task04_106.season(12));
    }

    public static void testSeason2() {
        Assert.assertEquals("spring", Task04_106.season(3));
    }

    public static void testSeason3() {
        Assert.assertEquals("summer", Task04_106.season(6));
    }

    public static void testSeason4() {
        Assert.assertEquals("fall", Task04_106.season(10));
    }
}
