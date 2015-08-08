package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_015Test {
    public static void main(String[] args) {
        testIndexOfChar1();
        testIndexOfChar2();
    }

    public static void testIndexOfChar1() {
        Assert.assertEquals('c', Task09_015.indexOfChar("abdce", 3));
    }

    public static void testIndexOfChar2() {
        Assert.assertEquals('e', Task09_015.indexOfChar("abdce", 4));
    }
}
