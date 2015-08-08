package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task11_158Test {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int[] a = {1, 6, 7, 8, 2, 1, 3, 6, 4, 8};
        int[] b = {7, 2, 1, 3, 6, 4, 8, 0, 0, 0};
        Assert.assertEquals(b, Task11_158.arr(a));
    }
}
