package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task11_245Test {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[] a = {-8, 5, 7, -1, -9, 7, 5, 7, 1, 2, 6, -4};
        int[] b = {-8, -1, -9, -4, 6, 2, 1, 7, 5, 7, 7, 5};
        Assert.assertEquals(b, Task11_245.negativeNumbersFirst(a));
    }
}
