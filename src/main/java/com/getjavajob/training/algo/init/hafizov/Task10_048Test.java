package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_048Test {
    public static void main(String[] args) {
        testMaxOfArr();
    }

    public static void testMaxOfArr() {
        int[] arr = {3, 2, 8, 10, 5, 4, 3, 7, 4};
        Assert.assertEquals(10, Task10_048.maxOfArr(arr, arr.length));
    }
}
