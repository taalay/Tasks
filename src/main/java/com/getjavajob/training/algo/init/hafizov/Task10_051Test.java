package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_051Test {
    public static void main(String[] args) {
        testProcedure1();
        testProcedure2();
        testProcedure3();
    }

    public static void testProcedure1() {
        Assert.assertEquals("54321", Task10_051.procedure1(5));
    }

    public static void testProcedure2() {
        Assert.assertEquals("12345", Task10_051.procedure2(5));
    }

    public static void testProcedure3() {
        Assert.assertEquals("5432112345", Task10_051.procedure3(5));
    }
}
