package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_185Test {
    public static void main(String[] args) {
        testBrackets_true();
        testBrackets_false();
        testBrackets_false2();
    }

    public static void testBrackets_true() {
        Assert.assertEquals("Yes. All right", Task09_185.brackets("!(!x & y) | (x & !z)"));
    }

    public static void testBrackets_false() {
        Assert.assertEquals("No. the number of opening brackets 3", Task09_185.brackets("!((!x & y) | (x & !z)"));
    }

    public static void testBrackets_false2() {
        Assert.assertEquals("No. The first closing bracket 8", Task09_185.brackets("!(!x & y) | (x &) !z)"));
    }
}
