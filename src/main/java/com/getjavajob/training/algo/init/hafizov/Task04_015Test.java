package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task04_015Test {
    public static void main(String[] args) {
        testHowOld1();
        testHowOld2();
        testHowOld3();
    }

    public static void testHowOld1() {
        Assert.assertEquals(29, Task04_015.howOld(12, 2014, 06, 1985));
    }

    public static void testHowOld2() {
        Assert.assertEquals(28, Task04_015.howOld(05, 2014, 06, 1985));
    }

    public static void testHowOld3() {
        Assert.assertEquals(29, Task04_015.howOld(06, 2014, 06, 1985));
    }
}
