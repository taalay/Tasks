package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task09_166Test {
    public static void main(String[] args) {
        testMoveWord();
    }

    public static void testMoveWord() {
        Assert.assertEquals("world hello", Task09_166.removeWord("hello world"));
    }
}
