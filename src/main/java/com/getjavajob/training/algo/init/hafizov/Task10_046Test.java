package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_046Test {
    public static void main(String[] args) {
        testGeometr();
        testGeometr2();
    }

    public static void testGeometr() {
        Assert.assertEquals(1.7179250691067045E47, Task10_046.getGeometryN(1, 3, 100));
    }

    public static void testGeometr2() {
        Assert.assertEquals(2.5768876036600566E47, Task10_046.getGeometrSum(1, 3, 100));
    }
}
